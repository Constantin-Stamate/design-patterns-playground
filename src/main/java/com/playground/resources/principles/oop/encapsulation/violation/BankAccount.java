package com.playground.resources.principles.oop.encapsulation.violation;

public class BankAccount {

    public String accountNumber;
    public String accountHolderName;
    public String accountType;
    public double balance;
    public String currency;
    public String branchCode;
    public int creationYear;

    public BankAccount(String accountNumber, String accountHolderName, String accountType, double balance, String currency, String branchCode, int creationYear) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.currency = currency;
        this.branchCode = branchCode;
        this.creationYear = creationYear;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}