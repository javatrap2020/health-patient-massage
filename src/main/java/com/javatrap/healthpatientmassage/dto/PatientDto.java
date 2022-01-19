package com.javatrap.healthpatientmassage.dto;

import com.javatrap.healthpatientmassage.repo.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDto {
    private Long patientId;
    @NotBlank(message = "Name shouldn't be empty")
    private String firstName;
    @NotBlank(message = "Last name shouldn't be empty")
    private String lastName;
    @Email(message = "Please enter valid email")
    private String email;

    public static Patient map(PatientDto patientDto) {
        return Patient.builder()
                .patientId(patientDto.getPatientId())
                .firstName(patientDto.getFirstName())
                .lastName(patientDto.getLastName())
                .email(patientDto.getEmail())
                .build();
    }

    public static PatientDto map(Patient patient) {
        return PatientDto.builder()
                .patientId(patient.getPatientId())
                .firstName(patient.getFirstName())
                .lastName(patient.getLastName())
                .email(patient.getEmail())
                .build();
    }
}
