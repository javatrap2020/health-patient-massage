package com.javatrap.healthpatientmassage.controller;

import com.javatrap.healthpatientmassage.dto.PatientDto;
import com.javatrap.healthpatientmassage.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.transaction.Transactional;
import java.util.List;

import static com.javatrap.healthpatientmassage.links.PatientLinks.*;

@RestController
@RequestMapping(API_PATIENTS)
public class PatientController {
    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping()
    @Transactional
    public PatientDto save(@RequestBody PatientDto patientDto) {
        return patientService.save(patientDto);
    }

    @PutMapping()
    @Transactional
    public PatientDto update(@RequestBody PatientDto patientDto) {
        return patientService.update(patientDto);
    }

    @GetMapping(API_PATIENT_ID)
    public PatientDto getPatientById(@PathVariable Long patientId) {
        return patientService.getPatientById(patientId);
    }

    @GetMapping
    public List<PatientDto> getAllPatient() {
        return patientService.getAllPatients();
    }
}
