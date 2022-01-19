package com.javatrap.healthpatientmassage.exeption;

public class PatientAlreadyExistException extends RuntimeException {
    private static final String MESSAGE_ALREADY = "This patient already exist";
    public PatientAlreadyExistException() {
        super(MESSAGE_ALREADY);
    }
}
