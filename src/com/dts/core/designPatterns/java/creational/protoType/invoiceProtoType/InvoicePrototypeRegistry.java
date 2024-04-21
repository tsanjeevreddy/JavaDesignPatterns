package com.dts.core.designPatterns.java.creational.protoType.invoiceProtoType;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
