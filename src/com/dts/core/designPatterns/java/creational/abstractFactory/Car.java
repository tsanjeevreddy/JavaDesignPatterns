package com.dts.core.designPatterns.java.creational.abstractFactory;

public class Car implements Vehicle{

    @Override
    public void start(OEM oem) {
        System.out.println(oem + " Starting new car...");
    }

}
