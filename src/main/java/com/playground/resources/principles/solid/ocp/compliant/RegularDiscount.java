package com.playground.resources.principles.solid.ocp.compliant;

public class RegularDiscount implements DiscountPolicy {

    @Override
    public double getDiscount(double total) {
        System.out.println("Regular discount applied");
        return total * 0.90;
    }
}