package com.playground.resources.principles.solid.isp.violation;

public class OldPrinter implements IMachine {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scan not supported!");
    }

    @Override
    public void fax() {
        System.out.println("Fax not supported!");
    }
}