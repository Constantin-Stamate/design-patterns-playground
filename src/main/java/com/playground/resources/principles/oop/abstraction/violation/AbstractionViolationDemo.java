package com.playground.resources.principles.oop.abstraction.violation;

public class AbstractionViolationDemo {

    public static void main(String[] args) {
        CheckingService checking = new CheckingService("123456789", 1000);
        CreditService credit = new CreditService("987654321", 2000);

        checking.processTransaction(500);
        credit.processTransaction(500);

        checking.specialCheckingMethod();
        credit.specialCreditMethod();
    }
}