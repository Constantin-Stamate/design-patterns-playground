package com.playground.resources.principles.solid.isp.compliant;

public class MultiFunctionDevice implements IPrinter, IScanner, IFax {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}