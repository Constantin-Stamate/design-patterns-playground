package com.playground.resources.principles.solid.ocp.compliant;

import java.util.Map;

public class DiscountService {

    private final Map<String, DiscountPolicy> policies;

    public DiscountService(Map<String, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double calculate(String customerType, double total) {
        if (!policies.containsKey(customerType)) {
            System.out.println("No discount policy found");
            return total;
        }

        return policies.get(customerType).getDiscount(total);
    }
}