package com.dts.core.designPatterns.java.creational.abstractFactory;

public class TriCycle implements Vehicle {

    @Override
    public void start(OEM oem) {
        System.out.println(oem + " Starting new TriCycle...");
    }

}
