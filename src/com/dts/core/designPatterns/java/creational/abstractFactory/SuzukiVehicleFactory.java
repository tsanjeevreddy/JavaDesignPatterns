package com.dts.core.designPatterns.java.creational.abstractFactory;

public class SuzukiVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle registerNewBike() {
        return new Bike();
    }

    @Override
    public Vehicle registerNewCar() {
        return new Car();
    }

    @Override
    public Vehicle registerNewTriCycle() {
        return new TriCycle();
    }

}
