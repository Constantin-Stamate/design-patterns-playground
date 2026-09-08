package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public interface PaymentFactory {

    Payment createPayment();

    Receipt createReceipt();
}