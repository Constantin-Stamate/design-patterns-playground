package com.playground.resources.principles.solid.lsp.compliant;

public abstract class NonFlyingBird extends Bird {

    @Override
    public void move() {
        walk();
    }

    public abstract void walk();
}