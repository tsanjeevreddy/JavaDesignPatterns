package com.dts.core.designPatterns.java.structural.decorator;

public class CapuchinoCofee extends CofeeDecorator {

    public CapuchinoCofee(Cofee cofee) {
        super(cofee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }

    @Override
    public String getIngrediants() {
        return super.getIngrediants() + ", Milk";
    }
    
}
