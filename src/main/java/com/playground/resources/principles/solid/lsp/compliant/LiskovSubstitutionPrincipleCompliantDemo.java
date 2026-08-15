package com.playground.resources.principles.solid.lsp.compliant;

public class LiskovSubstitutionPrincipleCompliantDemo {

    public static void main(String[] args) {
        BirdWatcher watcher = new BirdWatcher();

        Bird eagle = new Eagle();
        watcher.makeBirdMove(eagle);

        Bird ostrich = new Ostrich();
        watcher.makeBirdMove(ostrich);
    }
}