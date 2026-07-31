package com.playground.resources.principles.oop.encapsulation.compliant;

public class EncapsulationCompliantDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", "Checking", 1000, "USD", "BR001", 2022);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder: " + account.getAccountHolderName());
        System.out.println("Account type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Currency: " + account.getCurrency());
        System.out.println("Branch code: " + account.getBranchCode());
        System.out.println("Creation year: " + account.getCreationYear());

        account.deposit(500);
        account.withdraw(200);

        System.out.println("\nAfter transactions:");
        System.out.println("Balance: " + account.getBalance());

        account.setBalance(-100);
        account.setAccountType("Business");
        account.setCurrency("US");

        System.out.println("\nAfter invalid setters:");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account type: " + account.getAccountType());
        System.out.println("Currency: " + account.getCurrency());

        account.setBalance(2000);
        account.setAccountType("Savings");
        account.setCurrency("EUR");

        System.out.println("\nAfter valid setters:");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account type: " + account.getAccountType());
        System.out.println("Currency: " + account.getCurrency());
    }
}