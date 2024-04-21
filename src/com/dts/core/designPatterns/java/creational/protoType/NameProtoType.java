package com.dts.core.designPatterns.java.creational.protoType;

public class NameProtoType implements ProtoType {

    private String name;

    public NameProtoType(String name) {
        this.name = name;
    }

    @Override
    public NameProtoType clone() {
        return new NameProtoType(this.name);
    }

    public String getName() {
        return name;
    }
}
