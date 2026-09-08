package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class Checkout {

    private final Payment payment;
    private final Receipt receipt;

    public Checkout(PaymentFactory factory) {
        this.payment = factory.createPayment();
        this.receipt = factory.createReceipt();
    }

    public void process() {
        payment.pay();
        receipt.download();
    }
}