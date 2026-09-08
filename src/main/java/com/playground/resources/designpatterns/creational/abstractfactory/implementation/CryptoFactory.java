package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class CryptoFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
        return new CryptoPayment();
    }

    @Override
    public Receipt createReceipt() {
        return new CryptoReceipt();
    }
}