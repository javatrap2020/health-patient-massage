package com.javatrap.healthpatientmassage.exeption;

public class PatientNotFoundException extends RuntimeException {
    private static final String MESSAGE_EXCEPTION = "This patient doesn't exist";
    public PatientNotFoundException() {
        super(MESSAGE_EXCEPTION);
    }
}
