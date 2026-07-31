package com.playground.resources.principles.oop.polymorphism.compliant;

public class CreditService implements BankService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing credit transaction: $" + amount + " with interest $" + calculateFee(amount));
    }

    @Override
    public double calculateFee(double amount) {
        return amount * 0.02;
    }
}