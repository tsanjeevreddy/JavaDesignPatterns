package com.dts.core.designPatterns.java.structural.bridge;

public class BridgeTest {

    public static void main(String[] as) {
        Vehicle car = new Car();
        car.registerNewVehicle();
        car.finalizeQuote();
        car.handleService();
        Vehicle bike = new Bike();
        bike.registerNewVehicle();
        bike.finalizeQuote();
        bike.handleService();
    }

}
