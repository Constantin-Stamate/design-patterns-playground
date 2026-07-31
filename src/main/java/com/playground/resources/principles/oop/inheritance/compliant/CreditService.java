package com.playground.resources.principles.oop.inheritance.compliant;

public class CreditService extends BankService {

    public CreditService(String accountNumber, double balance) {
        super("Credit Service", accountNumber, balance);
    }

    public void withdraw(double amount) {
        double interest = amount * 0.02;
        balance -= (amount + interest);
        System.out.println("Credit withdrawal: $" + amount + " + interest $" + interest + ". New balance: $" + balance);
    }
}