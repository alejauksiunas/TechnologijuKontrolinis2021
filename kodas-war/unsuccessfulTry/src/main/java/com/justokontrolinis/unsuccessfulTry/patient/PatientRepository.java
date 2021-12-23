package com.justokontrolinis.unsuccessfulTry.patient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	@Query("SELECT s FROM Patient s WHERE s.email = ?1")
	Optional<Patient> findPatientByEmail(String email);
}
