package com.dts.core.designPatterns.creational.singleton;

public class DtsDBSingletonConnectEager {
    String connectName;
    String userName;
    String passwordAuthKeyToken;

    // This is creating a static object at class load time, Boot startUp application time.
    // This may slow up the application start time.
    // Early Instantiation: creation of instance at load time.
    private static DtsDBSingletonConnectEager connection = new DtsDBSingletonConnectEager();

    // Here we restricted the object creation outside this class
    private DtsDBSingletonConnectEager(){
    }

    // Here we exposed a method to fetch the existing connect object
    // This will get the eager loaded object which created at boot startUp time
    public static DtsDBSingletonConnectEager getDtsDBConnection(){
        return connection;
    }
}
