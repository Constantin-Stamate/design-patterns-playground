package com.playground.resources.principles.oop.polymorphism.violation;

public interface BankService {

    void processTransaction(double amount);

    double calculateFee(double amount);
}