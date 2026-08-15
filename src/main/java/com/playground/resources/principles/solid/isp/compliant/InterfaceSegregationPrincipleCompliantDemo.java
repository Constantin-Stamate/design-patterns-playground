package com.playground.resources.principles.solid.isp.compliant;

public class InterfaceSegregationPrincipleCompliantDemo {

    public static void main(String[] args) {
        IPrinter printer = new OldPrinter();
        printer.print();

        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.scan();
        mfd.print();
        mfd.fax();
    }
}