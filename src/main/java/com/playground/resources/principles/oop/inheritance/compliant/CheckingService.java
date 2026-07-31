package com.playground.resources.principles.oop.inheritance.compliant;

public class CheckingService extends BankService {

    public CheckingService(String accountNumber, double balance) {
        super("Checking Service", accountNumber, balance);
    }

    public void withdraw(double amount) {
        balance -= (amount + 1);
        System.out.println("Checking withdrawal: $" + amount + " + $1 fee. New balance: $" + balance);
    }
}