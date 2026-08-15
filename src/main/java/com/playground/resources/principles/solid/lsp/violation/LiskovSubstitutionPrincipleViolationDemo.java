package com.playground.resources.principles.solid.lsp.violation;

public class LiskovSubstitutionPrincipleViolationDemo {

    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher();

        Bird bird = new Bird();
        watcher.makeBirdFly(bird);

        Bird ostrich = new Ostrich();
        watcher.makeBirdFly(ostrich);
    }
}