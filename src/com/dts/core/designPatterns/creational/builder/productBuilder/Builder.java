package com.dts.core.designPatterns.creational.builder.productBuilder;

public interface Builder {

    void buildProductName(String productName);
    void buildProductType(String productType);
    void buildProductPrice(String productPrice);
    Product getResult();
}
