package com.playground.resources.principles.solid.ocp.violation;

public class DiscountCalculator {

    public double calculate(String customerType, double total) {
        if (customerType.equals("Regular")) {
            return total * 0.90;
        }

        if (customerType.equals("VIP")) {
            return total * 0.80;
        }

        return total;
    }
}