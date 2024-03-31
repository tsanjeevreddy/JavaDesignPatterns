package com.dts.core.designPatterns.creational.protoType.practice.cameraConfiguration;

public interface Configurable<T> {
    T clone();
}
