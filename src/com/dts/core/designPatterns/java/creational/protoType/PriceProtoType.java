package com.dts.core.designPatterns.java.creational.protoType;

public class PriceProtoType  implements ProtoType{

    private double priceValue;

    public PriceProtoType(double priceValue) {
        this.priceValue = priceValue;
    }

    @Override
    public PriceProtoType clone() {
        return new PriceProtoType(this.priceValue);
    }

    public double getPriceValue() {
        return priceValue;
    }

}
