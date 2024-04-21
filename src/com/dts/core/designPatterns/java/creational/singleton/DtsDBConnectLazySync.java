package com.dts.core.designPatterns.java.creational.singleton;

public class DtsDBConnectLazySync {
    String connectName;
    String userName;
    String passwordAuthKeyToken;
    private static DtsDBConnectLazySync connection = null;

    // Here we restricted the object creation outside this class
    private DtsDBConnectLazySync() {
    }

    // Here we exposed a method to fetch the existing connect object.
    // To make this works for multi thread apps we synchronized the method.
    // This is lazy loading, happening at runtime first call of this functionality.
    public static DtsDBConnectLazySync getDtsDBConnection() {
        if (connection == null) {
            synchronized (DtsDBConnectLazySync.class) {
                // double check on connection if null create new object
                if (connection == null)
                    connection = new DtsDBConnectLazySync();
            }
        }
        System.out.println("DtsDBConnectLazySync connection created with lazy loading");
        return connection;
    }

}
