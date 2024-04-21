package com.dts.core.designPatterns.java.creational.factory;

public class ToyotaVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle registerNewVehicle() {
        return new ToyotaVehicle();
    }

}
