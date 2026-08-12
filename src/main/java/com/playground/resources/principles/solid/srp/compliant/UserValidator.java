package com.playground.resources.principles.solid.srp.compliant;

public class UserValidator {

    public boolean isValid(String email, String password) {
        if (email == null || !email.contains("@")) {
            return false;
        }

        return password != null && password.length() >= 6;
    }
}