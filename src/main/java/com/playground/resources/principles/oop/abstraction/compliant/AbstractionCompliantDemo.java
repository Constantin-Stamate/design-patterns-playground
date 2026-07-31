package com.playground.resources.principles.oop.abstraction.compliant;

public class AbstractionCompliantDemo {

    public static void main(String[] args) {
        BankService[] services = {
                new CheckingService("123456789", 1000),
                new CreditService("987654321", 2000)
        };

        for (BankService service : services) {
            service.printServiceDetails();
            service.processTransaction(500);
        }
    }
}