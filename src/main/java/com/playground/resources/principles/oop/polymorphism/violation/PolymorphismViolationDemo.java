package com.playground.resources.principles.oop.polymorphism.violation;

public class PolymorphismViolationDemo {

    public static void main(String[] args) {
        BankService checking = new CheckingService();
        BankService credit = new CreditService();

        BankService[] services = {checking, credit};

        for (BankService service : services) {
            service.processTransaction(500);
            System.out.println("Fee calculated: $" + service.calculateFee(500));
        }
    }
}