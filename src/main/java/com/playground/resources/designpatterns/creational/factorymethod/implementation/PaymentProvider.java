package com.playground.resources.designpatterns.creational.factorymethod.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentProvider {

    private final Map<String, Supplier<PaymentService>> creators = new HashMap<>();

    public PaymentProvider() {
        creators.put("paypal", PaypalPaymentService::new);
        creators.put("stripe", StripePaymentService::new);
    }

    public PaymentService getService(String type) {
        if (!creators.containsKey(type)) {
            throw new IllegalArgumentException("Unsupported payment type");
        }

        return creators.get(type).get();
    }
}