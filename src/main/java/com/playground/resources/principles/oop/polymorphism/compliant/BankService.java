package com.playground.resources.principles.oop.polymorphism.compliant;

public interface BankService {

    void processTransaction(double amount);

    double calculateFee(double amount);
}