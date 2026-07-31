package com.playground.resources.principles.oop.abstraction.compliant;

public abstract class BankService {

    protected String serviceName;
    protected String accountNumber;
    protected double balance;

    public BankService(String serviceName, String accountNumber, double balance) {
        this.serviceName = serviceName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void processTransaction(double amount);

    public void printServiceDetails() {
        System.out.println("Service: " + serviceName + ", Account: " + accountNumber + ", Balance: $" + balance);
    }
}