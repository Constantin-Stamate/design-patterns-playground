package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class CryptoPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Crypto Pay");
    }
}