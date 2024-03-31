package com.dts.core.designPatterns.creational.builder.productBuilder;

public class ProductClient {

    public static void main(String[] as) {
        Director director = new Director();
        Product product = director.construct(new ConcreteBuilder());
        System.out.println("Final Product.. " + product);
    }
}
