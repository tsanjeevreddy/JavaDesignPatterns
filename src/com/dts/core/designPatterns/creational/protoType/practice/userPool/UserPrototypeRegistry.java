package com.dts.core.designPatterns.creational.protoType.practice.userPool;

import java.util.HashMap;

public interface UserPrototypeRegistry {


    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
