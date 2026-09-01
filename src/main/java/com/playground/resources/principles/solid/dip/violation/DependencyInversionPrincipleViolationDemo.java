package com.playground.resources.principles.solid.dip.violation;

public class DependencyInversionPrincipleViolationDemo {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        processor.process();
    }
}