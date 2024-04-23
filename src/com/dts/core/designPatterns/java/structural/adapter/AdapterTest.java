package com.dts.core.designPatterns.java.structural.adapter;

public class AdapterTest {

    public static void main(String[] as) {
        DtsPaymentGateway paypalGateway = new PaypalAdapter(new Paypal());
        paypalGateway.processPayment(100);

        DtsPaymentGateway masterCardGateway = new MasterCardAdapter(new MasterCardGateWay());
        masterCardGateway.processPayment(500);
    }
 
}
