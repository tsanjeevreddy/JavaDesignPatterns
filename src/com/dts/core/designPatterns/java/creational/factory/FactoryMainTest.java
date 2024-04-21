package com.dts.core.designPatterns.java.creational.factory;

public class FactoryMainTest {

    public static void main(String[] as) {

        VehicleFactory vehicleFactory = new ToyotaVehicleFactory();
        Vehicle vehicle = vehicleFactory.registerNewVehicle();
        vehicle.start();

        VehicleFactory vFactory = new AudiVehicleFactory();
        Vehicle v = vFactory.registerNewVehicle();
        v.start();

    }

}
