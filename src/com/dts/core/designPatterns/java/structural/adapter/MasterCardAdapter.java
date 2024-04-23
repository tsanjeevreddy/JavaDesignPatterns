package com.dts.core.designPatterns.java.structural.adapter;

public class MasterCardAdapter implements DtsPaymentGateway{
    private MasterCardGateWay masterCardGateWay;

    public MasterCardAdapter(MasterCardGateWay paymenGateWay) {
        this.masterCardGateWay = paymenGateWay;
    }

    @Override
    public void processPayment(double amount) {
        this.masterCardGateWay.charge(amount);
    }

}
