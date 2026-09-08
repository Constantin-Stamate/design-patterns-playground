package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        PaymentProvider provider = new PaymentProvider();

        PaymentService service = provider.getService("stripe");
        service.pay(100);

        service = provider.getService("paypal");
        service.pay(200);
    }
}