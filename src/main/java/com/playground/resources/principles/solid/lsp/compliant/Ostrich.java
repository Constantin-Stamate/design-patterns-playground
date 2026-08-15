package com.playground.resources.principles.solid.lsp.compliant;

public class Ostrich extends NonFlyingBird {

    @Override
    public void walk() {
        System.out.println("Ostrich running fast!");
    }
}