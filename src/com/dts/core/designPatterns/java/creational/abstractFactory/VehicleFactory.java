package com.dts.core.designPatterns.java.creational.abstractFactory;

public interface VehicleFactory {
    Vehicle registerNewBike();
    Vehicle registerNewCar();
    Vehicle registerNewTriCycle();
}

