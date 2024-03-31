package com.dts.core.designPatterns.creational.builder.productBuilder;

public class Product {
    private String productName;
    private String productType;
    private String productPrice;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
