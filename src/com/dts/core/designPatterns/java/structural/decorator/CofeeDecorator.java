package com.dts.core.designPatterns.java.structural.decorator;

public class CofeeDecorator implements Cofee {
    private Cofee decoratorCofee;

    public CofeeDecorator(Cofee cofee) {
        this.decoratorCofee = cofee;
    }

    @Override
    public double getCost() {
        return decoratorCofee.getCost();
    }

    @Override
    public String getIngrediants() {
        return decoratorCofee.getIngrediants();
    }

}
