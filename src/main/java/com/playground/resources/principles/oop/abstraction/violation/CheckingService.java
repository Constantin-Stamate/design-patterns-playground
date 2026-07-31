package com.playground.resources.principles.oop.abstraction.violation;

public class CheckingService extends BankService {

    public CheckingService(String accountNumber, double balance) {
        super("Checking Service", accountNumber, balance);
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Generic transaction for checking: $" + amount);
    }

    public void specialCheckingMethod() {
        System.out.println("Must downcast to call this!");
    }
}