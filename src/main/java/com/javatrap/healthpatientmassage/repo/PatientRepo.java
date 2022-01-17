package com.javatrap.healthpatientmassage.repo;

import com.javatrap.healthpatientmassage.repo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
}
