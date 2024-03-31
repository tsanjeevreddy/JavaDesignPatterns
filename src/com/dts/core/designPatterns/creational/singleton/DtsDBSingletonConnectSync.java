package com.dts.core.designPatterns.creational.singleton;

public class DtsDBSingletonConnectSync {
    String connectName;
    String userName;
    String passwordAuthKeyToken;
    private static DtsDBSingletonConnectSync connection = null;

    // Here we restricted the object creation outside this class
    private DtsDBSingletonConnectSync() {
    }

    // Here we exposed a method to fetch the existing connect object.
    // To make this works for multi thread apps we synchronized the method.
    // This is lazy loading,  happening at runtime first call of this functionality.
    public static DtsDBSingletonConnectSync getDtsDBConnection(){
        if(connection == null) {
           synchronized(DtsDBSingletonConnectSync.class) {
               if(connection == null) // double check on connection
                connection = new DtsDBSingletonConnectSync();
            }
        }
        return connection;
    }


}
