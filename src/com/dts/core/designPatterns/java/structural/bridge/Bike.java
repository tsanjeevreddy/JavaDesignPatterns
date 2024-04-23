package com.dts.core.designPatterns.java.structural.bridge;

public class Bike implements Vehicle {
    @Override
    public void registerNewVehicle() {
        System.out.println("New Bike registered..");
    }

    @Override
    public void finalizeQuote() {
        System.out.println("Final Quote ready for Bike..");
    }

    @Override
    public void handleService() {
        System.out.println("Service Started for Bike..");
    }

}
