package com.dts.core.designPatterns.java.creational.protoType.userPool;

public interface UserPrototypeRegistry {


    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
