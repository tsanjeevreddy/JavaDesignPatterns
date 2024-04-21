package com.dts.core.designPatterns.java.creational.abstractFactory;

public class AbstractFactoryMainTest {

    public static void main(String[] as) {

        VehicleFactory hFactory = new HondaVehicleFactory();
        Vehicle hondaCar = hFactory.registerNewCar();
        hondaCar.start(OEM.HONDA);
        Vehicle hondaBike = hFactory.registerNewBike();
        hondaBike.start(OEM.HONDA);
        Vehicle hondaTriCycle = hFactory.registerNewTriCycle();
        hondaTriCycle.start(OEM.HONDA);

        VehicleFactory sFactory = new SuzukiVehicleFactory();
        Vehicle sCar = sFactory.registerNewCar();
        sCar.start(OEM.SUZUKI);
        Vehicle sBike = sFactory.registerNewBike();
        sBike.start(OEM.SUZUKI);
        Vehicle sTriCycle = sFactory.registerNewTriCycle();
        sTriCycle.start(OEM.SUZUKI);

    }

}
