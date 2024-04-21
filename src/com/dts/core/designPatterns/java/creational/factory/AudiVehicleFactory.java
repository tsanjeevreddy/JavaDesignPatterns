package com.dts.core.designPatterns.java.creational.factory;

public class AudiVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle registerNewVehicle() {
        return new AudiVehicle();
    }
}
