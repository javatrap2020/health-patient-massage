package com.javatrap.healthpatientmassage.links;

import org.springframework.stereotype.Component;

@Component
public class PatientLinks {
    public static final String LIST_PATIENTS = "/patients";
    public static final String PATIENTS = "patients";
    public static final String EMAIL = "email";
    public static final String MESSAGES = "messages";
    public static final String PATIENT_ID = "/{patientId}";

}
