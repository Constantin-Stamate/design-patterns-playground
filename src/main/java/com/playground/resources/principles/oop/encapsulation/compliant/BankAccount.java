package com.playground.resources.principles.oop.encapsulation.compliant;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private String currency;
    private String branchCode;
    private int creationYear;

    public BankAccount(String accountNumber, String accountHolderName, String accountType, double balance, String currency, String branchCode, int creationYear) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.currency = currency;
        this.branchCode = branchCode;
        this.creationYear = creationYear;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number");
        }
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid account holder name");
        }
    }

    public void setAccountType(String accountType) {
        if (accountType != null && (accountType.equalsIgnoreCase("Checking") || accountType.equalsIgnoreCase("Savings"))) {
            this.accountType = accountType;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void setCurrency(String currency) {
        if (currency != null && currency.length() == 3) {
            this.currency = currency.toUpperCase();
        } else {
            System.out.println("Invalid currency");
        }
    }

    public void setBranchCode(String branchCode) {
        if (branchCode != null && branchCode.length() >= 3) {
            this.branchCode = branchCode;
        } else {
            System.out.println("Invalid branch code");
        }
    }

    public void setCreationYear(int creationYear) {
        if (creationYear >= 1900 && creationYear <= 2026) {
            this.creationYear = creationYear;
        } else {
            System.out.println("Invalid creation year");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}