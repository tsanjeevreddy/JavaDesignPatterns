package com.dts.core.designPatterns.java.creational.singleton;

import java.io.Serializable;

public class DtsDataSerialize implements Serializable {
    // here volatile will tell compiler this indstance will get change for each thread
    private static volatile DtsDataSerialize instance;
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private DtsDataSerialize() {
        setKey("Dts");
        setValue("Reddy");
    }

    public static DtsDataSerialize getInstance() {
        if(instance == null) {
            synchronized(DtsDataSerialize.class) {
                if(instance == null) {
                    instance = new DtsDataSerialize();
                }
            }
        }
        System.out.println("DtsDBConnectSerialize connection created with serialization aspect");
        return instance;
    }

    // readResolve() will be called in deserialization process e=and ensure only one instace return
    // One reason we used protected here was to have limited access, only for sub class usage.
    // Second reason we used protected here was to restrict to overriding the sub classes
    protected Object readResolve() {
        return getInstance();
    }

}
