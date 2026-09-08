package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class StripePayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Stripe Pay");
    }
}