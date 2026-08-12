package com.playground.resources.principles.solid.ocp.compliant;

import java.util.HashMap;
import java.util.Map;

public class OpenClosedPrincipleCompliantDemo {

    public static void main(String[] args) {
        Map<String, DiscountPolicy> policies = new HashMap<>();
        policies.put("Regular", new RegularDiscount());
        policies.put("VIP", new VipDiscount());
        policies.put("Business", new BusinessDiscount());

        DiscountService service = new DiscountService(policies);

        System.out.println(service.calculate("Business", 1000));
    }
}