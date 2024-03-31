package com.dts.core.designPatterns.creational.protoType.practice.invoiceProtoType;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
