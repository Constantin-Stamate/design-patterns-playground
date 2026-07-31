package com.playground.resources.principles.oop.polymorphism.compliant;

public class CheckingService implements BankService {

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing checking transaction: $" + amount + " with fee $" + calculateFee(amount));
    }

    @Override
    public double calculateFee(double amount) {
        return 1.0;
    }
}