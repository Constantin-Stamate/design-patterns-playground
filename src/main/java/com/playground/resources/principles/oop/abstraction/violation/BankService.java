package com.playground.resources.principles.oop.abstraction.violation;

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
}