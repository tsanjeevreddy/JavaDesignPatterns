package com.dts.core.designPatterns.java.structural.decorator;

public class ExtraSugarCofee extends CofeeDecorator {

    public ExtraSugarCofee(Cofee cofee) {
        super(cofee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }

    @Override
    public String getIngrediants() {
        return super.getIngrediants() + ", Sugar";
    }

}
