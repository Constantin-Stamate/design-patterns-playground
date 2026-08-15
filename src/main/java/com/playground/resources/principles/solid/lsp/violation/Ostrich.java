package com.playground.resources.principles.solid.lsp.violation;

public class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}