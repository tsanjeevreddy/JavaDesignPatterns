package com.dts.core.designPatterns.java.structural.decorator;

public class DecoratorTest {
    public static void main(String[] as) {
        Cofee cofee = new BlackCofee();
        System.out.println("Black Cofee $" + cofee.getCost() + " Ingrediants: " + cofee.getIngrediants());

        // Decorate the cofee with Milk
        cofee = new CapuchinoCofee(cofee);
        System.out.println("Capuchino Cofee Cost $" + cofee.getCost() + " Ingrediants: " + cofee.getIngrediants());

        // Decorate the cofee with Extra Sugar
        cofee = new ExtraSugarCofee(cofee);
        System.out.println("Extra Sugar Cofee Cost $" + cofee.getCost() + " Ingrediants: " + cofee.getIngrediants());
    }

}
