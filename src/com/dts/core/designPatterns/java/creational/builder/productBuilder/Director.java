package com.dts.core.designPatterns.java.creational.builder.productBuilder;

public class Director {
    public Product construct(Builder builder) {
        builder.buildProductName("Audi");
        builder.buildProductPrice("100 K");
        builder.buildProductType("Top Most Brand..");
        return builder.getResult();
    }
}
