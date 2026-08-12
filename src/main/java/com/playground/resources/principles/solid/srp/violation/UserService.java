package com.playground.resources.principles.solid.srp.violation;

public class UserService {

    public void register(String email, String password) {
        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email");
            return;
        }

        if (password == null || password.length() < 6) {
            System.out.println("Password is too short");
            return;
        }

        System.out.println("User with email " + email + " has been saved to the database");
        System.out.println("Welcome email sent to " + email);
    }
}