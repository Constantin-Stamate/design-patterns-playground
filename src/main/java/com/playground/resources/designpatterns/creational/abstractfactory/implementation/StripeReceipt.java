package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class StripeReceipt implements Receipt {

    @Override
    public void download() {
        System.out.println("Stripe Download");
    }
}