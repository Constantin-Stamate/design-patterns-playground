package com.playground.resources.principles.oop.abstraction.violation;

public class CreditService extends BankService {

    public CreditService(String accountNumber, double balance) {
        super("Credit Service", accountNumber, balance);
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Generic transaction for credit: $" + amount);
    }

    public void specialCreditMethod() {
        System.out.println("Must downcast to call this!");
    }
}