package com.playground.resources.principles.oop.inheritance.violation;

class CreditService {

    protected String serviceName;
    protected String accountNumber;
    protected double balance;

    public CreditService(String serviceName, String accountNumber, double balance) {
        this.serviceName = serviceName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        double interest = amount * 0.02;
        balance -= (amount + interest);
        System.out.println("Credit withdrawal: $" + amount + " + interest $" + interest + ". New balance: $" + balance);
    }

    public void printServiceDetails() {
        System.out.println("Service: " + serviceName + ", Account: " + accountNumber + ", Balance: $" + balance);
    }
}