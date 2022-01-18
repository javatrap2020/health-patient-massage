package com.javatrap.healthpatientmassage.service;

import com.javatrap.healthpatientmassage.dto.PatientDto;
import com.javatrap.healthpatientmassage.exeption.PatientNotFoundException;
import com.javatrap.healthpatientmassage.repo.MessageReadRepo;
import com.javatrap.healthpatientmassage.repo.PatientRepo;
import com.javatrap.healthpatientmassage.repo.entity.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepo patientRepo;
    private final MessageReadRepo messageReadRepo;

    public PatientServiceImpl(PatientRepo patientRepo, MessageReadRepo messageReadRepo) {
        this.patientRepo = patientRepo;
        this.messageReadRepo = messageReadRepo;
    }

    @Override
    public PatientDto update(PatientDto patientDto) {
        log.info("Updating user {}", patientDto);
        Patient patient = patientRepo.findPatientByEmail(patientDto.getEmail()).orElseThrow(PatientNotFoundException::new);
        patient.setFirstName(patientDto.getFirstMame());
        patient.setLastName(patientDto.getLastName());
        return PatientDto.map(patientRepo.save(patient));
    }

    @Override
    public PatientDto getPatientById(Long patientId) {
        log.info("Receiving patient by patient id {}", patientId);
        return patientRepo.findById(patientId).map(PatientDto::map).orElse(null);
    }

    @Override
    public List<PatientDto> getAllPatients() {
        return patientRepo.findAll().stream().map(PatientDto::map)
                .sorted(Comparator.comparing(PatientDto::getLastName))
                .collect(Collectors.toList());
    }
}
