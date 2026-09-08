package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        PaymentFactory factory = new StripeFactory();

        Checkout checkout = new Checkout(factory);
        checkout.process();

        System.out.println();

        factory = new CryptoFactory();
        checkout = new Checkout(factory);
        checkout.process();
    }
}