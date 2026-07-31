package com.playground.resources.principles.oop.inheritance.compliant;

public class InheritanceCompliantDemo {

    public static void main(String[] args) {
        CheckingService checking = new CheckingService("123456789", 1000);
        CreditService credit = new CreditService("987654321", 2000);

        checking.printServiceDetails();
        checking.withdraw(200);

        credit.printServiceDetails();
        credit.withdraw(200);
    }
}