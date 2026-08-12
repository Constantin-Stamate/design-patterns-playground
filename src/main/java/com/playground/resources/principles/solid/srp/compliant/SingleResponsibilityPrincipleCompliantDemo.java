package com.playground.resources.principles.solid.srp.compliant;

public class SingleResponsibilityPrincipleCompliantDemo {

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository();
        EmailSender emailSender = new EmailSender();

        RegistrationService service = new RegistrationService(validator, repository, emailSender);
        service.register("student@utm.md", "password123");
    }
}