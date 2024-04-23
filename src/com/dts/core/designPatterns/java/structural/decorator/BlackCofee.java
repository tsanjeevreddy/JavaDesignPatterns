package com.dts.core.designPatterns.java.structural.decorator;

public class BlackCofee implements Cofee {

    @Override
    public double getCost() {
        return 3.0;
    }

    @Override
    public String getIngrediants() {
        return "Black Cofee";
    }

}
