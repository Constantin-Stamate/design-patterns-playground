package com.playground.resources.principles.solid.srp.compliant;

public class UserRepository {

    public void save(String email) {
        System.out.println("User with email " + email + " has been saved to the database");
    }
}