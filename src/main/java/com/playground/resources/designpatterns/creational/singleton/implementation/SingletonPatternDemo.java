package com.playground.resources.designpatterns.creational.singleton.implementation;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Same Logger instance");
        }

        logger1.log("Application started");
        logger2.log("User authenticated");
        logger3.log("Application is shutting down");
    }
}