package com.dts.core.designPatterns.creational.builder.productBuilder;

public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildProductName(String productName) {
        if(productName == "Audi") {
            product.setProductName(productName);
        }
    }

    @Override
    public void buildProductType(String productType) {
        product.setProductType(productType);
    }

    @Override
    public void buildProductPrice(String productPrice) {
        if(productPrice == "100 K") {
            product.setProductPrice(productPrice);
        }
    }

    @Override
    public Product getResult() {
        return product;
    }
}
