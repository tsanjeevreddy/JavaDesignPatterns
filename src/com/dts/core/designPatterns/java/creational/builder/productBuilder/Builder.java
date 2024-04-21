package com.dts.core.designPatterns.java.creational.builder.productBuilder;

public interface Builder {

    void buildProductName(String productName);
    void buildProductType(String productType);
    void buildProductPrice(String productPrice);
    Product getResult();
}
