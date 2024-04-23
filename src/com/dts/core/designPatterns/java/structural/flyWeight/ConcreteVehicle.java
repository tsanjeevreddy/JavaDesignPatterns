package com.dts.core.designPatterns.java.structural.flyWeight;

public class ConcreteVehicle implements Vehicle {

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public Color getColor() {
        return new Color();
    }

}
