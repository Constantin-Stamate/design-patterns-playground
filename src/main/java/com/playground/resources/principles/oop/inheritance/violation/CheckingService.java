package com.playground.resources.principles.oop.inheritance.violation;

class CheckingService {

    protected String serviceName;
    protected String accountNumber;
    protected double balance;

    public CheckingService(String serviceName, String accountNumber, double balance) {
        this.serviceName = serviceName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        balance -= (amount + 1);
        System.out.println("Checking withdrawal: $" + amount + " + $1 fee. New balance: $" + balance);
    }

    public void printServiceDetails() {
        System.out.println("Service: " + serviceName + ", Account: " + accountNumber + ", Balance: $" + balance);
    }
}