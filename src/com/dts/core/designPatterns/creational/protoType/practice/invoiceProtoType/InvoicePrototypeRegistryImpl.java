package com.dts.core.designPatterns.creational.protoType.practice.invoiceProtoType;

import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry{

    HashMap<InvoiceType, Invoice> invoiceHashMap = new HashMap<>();
    @Override
    public void addPrototype(Invoice invoice) {
        invoiceHashMap.put(invoice.getType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return invoiceHashMap.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return invoiceHashMap.get(type).cloneObject();
    }
}
