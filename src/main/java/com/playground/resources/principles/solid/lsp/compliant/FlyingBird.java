package com.playground.resources.principles.solid.lsp.compliant;

public abstract class FlyingBird extends Bird {

    @Override
    public void move() {
        fly();
    }

    public abstract void fly();
}