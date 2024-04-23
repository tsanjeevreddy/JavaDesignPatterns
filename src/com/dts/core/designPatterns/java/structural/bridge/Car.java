package com.dts.core.designPatterns.java.structural.bridge;

public class Car implements Vehicle {

    @Override
    public void registerNewVehicle() {
        System.out.println("New Car registered..");
    }

    @Override
    public void finalizeQuote() {
        System.out.println("Final Quote ready for Car..");
    }

    @Override
    public void handleService() {
        System.out.println("Service Started for Car..");
    }

}
