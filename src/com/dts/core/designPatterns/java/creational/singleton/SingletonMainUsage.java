package com.dts.core.designPatterns.java.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonMainUsage {

    public static void main(String[] as) {
        // Singleton Design Pattern ensures that there’s only one instance of a class in your application
        DtsDBConnectEager.getDtsDBConnection();
        DtsDBConnectLazySync.getDtsDBConnection();
        testSerailizeSingleton();
    }

    private static void testSerailizeSingleton() {
        // serialization of SingleTon Object
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("/Users/dtsreddy/Desktop/clean/test.txt"))) {
            out.writeObject(DtsDataSerialize.getInstance());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // De serialization of SingleTon Object
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("/Users/dtsreddy/Desktop/clean/test.txt"))) {
            // here readObject() will look for any class readresolve() method if it exists
            // it will run through that method.
            DtsDataSerialize data = (DtsDataSerialize) in.readObject();
            System.out.println("Data from DtsDataSerialize Key: " + data.getKey());
            System.out.println("Data from DtsDataSerialize Value: " + data.getValue());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
