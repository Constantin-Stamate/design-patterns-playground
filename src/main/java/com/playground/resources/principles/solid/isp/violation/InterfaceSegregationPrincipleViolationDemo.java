package com.playground.resources.principles.solid.isp.violation;

public class InterfaceSegregationPrincipleViolationDemo {

    public static void main(String[] args) {
        IMachine printer = new OldPrinter();

        printer.print();

        printer.scan();
        printer.fax();
    }
}