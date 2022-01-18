package com.javatrap.healthpatientmassage.service;

import com.javatrap.healthpatientmassage.dto.PatientDto;

import java.util.List;

public interface PatientService {

    PatientDto update(PatientDto patientDto);

    PatientDto getPatientById(Long patientId);

    List<PatientDto> getAllPatients();

}
