package com.playground.resources.principles.oop.encapsulation.violation;

public class EncapsulationViolationDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", "Checking", 1000, "USD", "BR001", 2022);

        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Account holder: " + account.accountHolderName);
        System.out.println("Account type: " + account.accountType);
        System.out.println("Balance: " + account.balance);
        System.out.println("Currency: " + account.currency);
        System.out.println("Branch code: " + account.branchCode);
        System.out.println("Creation year: " + account.creationYear);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("\nAfter transactions:");
        System.out.println("Balance: " + account.balance);

        account.balance = -1000;
        account.accountType = "Business";
        account.currency = "US";
        account.creationYear = 1800;

        System.out.println("\nAfter invalid direct changes:");
        System.out.println("Balance: " + account.balance);
        System.out.println("Account type: " + account.accountType);
        System.out.println("Currency: " + account.currency);
        System.out.println("Creation year: " + account.creationYear);
    }
}