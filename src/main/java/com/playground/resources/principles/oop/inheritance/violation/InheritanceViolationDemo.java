package com.playground.resources.principles.oop.inheritance.violation;

public class InheritanceViolationDemo {

    public static void main(String[] args) {
        CheckingService checking = new CheckingService("Checking Service", "123456789", 1000);
        CreditService credit = new CreditService("Credit Service", "987654321", 2000);

        checking.printServiceDetails();
        credit.printServiceDetails();
    }
}