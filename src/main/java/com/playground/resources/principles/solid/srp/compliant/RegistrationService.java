package com.playground.resources.principles.solid.srp.compliant;

public class RegistrationService {

    private final UserValidator validator;
    private final UserRepository repository;
    private final EmailSender emailSender;

    public RegistrationService(UserValidator validator, UserRepository repository, EmailSender emailSender) {
        this.validator = validator;
        this.repository = repository;
        this.emailSender = emailSender;
    }

    public void register(String email, String password) {
        if (!validator.isValid(email, password)) {
            System.out.println("Registration failed. Invalid data.");
            return;
        }

        repository.save(email);
        emailSender.sendWelcome(email);
    }
}