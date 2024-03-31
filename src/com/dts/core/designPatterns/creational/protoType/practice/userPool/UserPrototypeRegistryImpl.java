package com.dts.core.designPatterns.creational.protoType.practice.userPool;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements  UserPrototypeRegistry{

    HashMap<UserType, User> userMap = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        userMap.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return userMap.get(type);
    }

    @Override
    public User clone(UserType type) {
        return userMap.get(type).cloneObject();
    }
}
