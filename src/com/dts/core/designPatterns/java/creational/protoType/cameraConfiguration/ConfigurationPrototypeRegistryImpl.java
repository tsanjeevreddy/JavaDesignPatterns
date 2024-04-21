package com.dts.core.designPatterns.java.creational.protoType.cameraConfiguration;

import java.util.HashMap;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    private HashMap<ConfigurationType, Configuration> map = new HashMap<>();
    @Override
    public void addPrototype(Configuration configuration) {
        map.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return map.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return map.get(type).clone();
    }
}
