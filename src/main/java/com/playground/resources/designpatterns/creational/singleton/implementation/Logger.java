package com.playground.resources.designpatterns.creational.singleton.implementation;

import java.time.LocalDateTime;

public class Logger {

    private static volatile Logger instance;
    private static final Object locker = new Object();

    private Logger() {
        System.out.println("Logger initialized thread-safe");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (locker) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }
}