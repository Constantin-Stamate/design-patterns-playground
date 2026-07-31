package com.playground.resources.principles.oop.abstraction.compliant;

public class CheckingService extends BankService {

    public CheckingService(String accountNumber, double balance) {
        super("Checking Service", accountNumber, balance);
    }

    @Override
    public void processTransaction(double amount) {
        balance -= amount + 1;
        System.out.println("Processed checking transaction: $" + amount + ", Fee $1, New balance: $" + balance);
    }
}