package com.playground.resources.principles.solid.isp.compliant;

public class OldPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}