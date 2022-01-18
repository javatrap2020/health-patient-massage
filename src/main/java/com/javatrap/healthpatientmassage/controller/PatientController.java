package com.javatrap.healthpatientmassage.controller;

import com.javatrap.healthpatientmassage.dto.PatientDto;
import com.javatrap.healthpatientmassage.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.javatrap.healthpatientmassage.links.PatientLinks.*;

@RestController
@RequestMapping(LIST_PATIENTS)
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PutMapping
    public PatientDto update(@RequestBody PatientDto patientDto) {
        return patientService.update(patientDto);
    }

    @GetMapping(PATIENT_ID)
    public PatientDto getPatientById(@PathVariable Long patientId) {
        return patientService.getPatientById(patientId);
    }

    @GetMapping
    public List<PatientDto> getAllPatient() {
        return patientService.getAllPatients();
    }
}
