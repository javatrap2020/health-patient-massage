package com.javatrap.healthpatientmassage.service;

import com.javatrap.healthpatientmassage.dto.PatientDto;

import java.net.UnknownHostException;
import java.util.List;

public interface PatientService {

    PatientDto update(PatientDto patientDto);

    PatientDto save(PatientDto patientDto) throws UnknownHostException;

    PatientDto getPatientById(Long patientId);

    List<PatientDto> getAllPatients();

}
