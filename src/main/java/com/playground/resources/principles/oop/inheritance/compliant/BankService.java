package com.playground.resources.principles.oop.inheritance.compliant;

class BankService {

    protected String serviceName;
    protected String accountNumber;
    protected double balance;

    public BankService(String serviceName, String accountNumber, double balance) {
        this.serviceName = serviceName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void printServiceDetails() {
        System.out.println("Service: " + serviceName + ", Account: " + accountNumber + ", Balance: $" + balance);
    }
}