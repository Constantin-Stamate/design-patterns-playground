package com.playground.resources.principles.oop.abstraction.compliant;

public class CreditService extends BankService {

    public CreditService(String accountNumber, double balance) {
        super("Credit Service", accountNumber, balance);
    }

    @Override
    public void processTransaction(double amount) {
        double interest = amount * 0.02;
        balance -= amount + interest;
        System.out.println("Processed credit transaction: $" + amount + ", Interest $" + interest + ", New balance: $" + balance);
    }
}