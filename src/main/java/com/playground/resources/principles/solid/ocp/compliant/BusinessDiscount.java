package com.playground.resources.principles.solid.ocp.compliant;

public class BusinessDiscount implements DiscountPolicy {

    @Override
    public double getDiscount(double total) {
        System.out.println("Business discount applied");
        return total * 0.60;
    }
}