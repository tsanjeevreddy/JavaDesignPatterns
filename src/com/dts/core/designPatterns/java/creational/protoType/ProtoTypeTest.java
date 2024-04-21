package com.dts.core.designPatterns.java.creational.protoType;

public class ProtoTypeTest {

    public static void main(String[] as) {
        testNameProtoType();
        testPriceProtoType();
    }

    private static void testNameProtoType() {
        NameProtoType nameProtoType = new NameProtoType("Dts Reddy");
        System.out.println("Actual NameProtoType Name Value: " + nameProtoType.getName());

        NameProtoType clonedProtoType = nameProtoType.clone();
        System.out.println("Cloned NameProtoType Name Value: " + clonedProtoType.getName());
    }

    private static void testPriceProtoType() {
        PriceProtoType priceProtoType = new PriceProtoType(100.00);
        System.out.println("Actual PriceProtoType Price Value: " + priceProtoType.getPriceValue());

        PriceProtoType clonedProtoType = priceProtoType.clone();
        System.out.println("Cloned PriceProtoType Price Value: " + clonedProtoType.getPriceValue());
    }
 
}
