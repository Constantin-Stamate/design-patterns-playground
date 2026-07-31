package com.playground.resources.principles.oop.polymorphism.violation;

public class CreditService implements BankService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing transaction: $" + amount);
    }

    @Override
    public double calculateFee(double amount) {
        return 0;
    }
}