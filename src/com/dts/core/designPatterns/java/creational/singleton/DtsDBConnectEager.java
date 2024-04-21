package com.dts.core.designPatterns.java.creational.singleton;

public class DtsDBConnectEager {
    String connectName;
    String userName;
    String passwordAuthKeyToken;

    // This is creating a static object at class load time, Boot startUp application time.
    // This may slow up the application start time.
    // Early Instantiation: creation of instance at load time. eager loaded object
    private static DtsDBConnectEager connection = new DtsDBConnectEager();

    // Here we restricted the object creation outside this class
    private DtsDBConnectEager(){
    }

    // Here we exposed a method to fetch the existing connect object
    // This will get the eager loaded object which created at boot startUp time
    public static DtsDBConnectEager getDtsDBConnection(){
        System.out.println("DtsDBConnectEager connection created with Eager loading");
        return connection;
    }
}
