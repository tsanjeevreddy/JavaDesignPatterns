package com.dts.core.designPatterns.java.structural.adapter;

public class PaypalAdapter implements DtsPaymentGateway {
    private Paypal paypalGateWay;

    public PaypalAdapter(Paypal paymentGateWay) {
        this.paypalGateWay = paymentGateWay;
    }

    @Override
    public void processPayment(double amount) {
        this.paypalGateWay.makePayment(amount);
    }

}
