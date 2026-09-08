package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class CryptoReceipt implements Receipt {

    @Override
    public void download() {
        System.out.println("Crypto Download");
    }
}