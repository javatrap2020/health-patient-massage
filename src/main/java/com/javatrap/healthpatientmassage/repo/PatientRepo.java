package com.javatrap.healthpatientmassage.repo;

import com.javatrap.healthpatientmassage.repo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import static com.javatrap.healthpatientmassage.links.PatientLinks.*;

import java.util.Optional;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
    Optional<Patient> findPatientByEmail(@Param(EMAIL) String email);
}
