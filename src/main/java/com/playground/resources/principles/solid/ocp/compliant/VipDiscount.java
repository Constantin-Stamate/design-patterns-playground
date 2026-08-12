package com.playground.resources.principles.solid.ocp.compliant;

public class VipDiscount implements DiscountPolicy {

    @Override
    public double getDiscount(double total) {
        System.out.println("VIP discount applied");
        return total * 0.80;
    }
}