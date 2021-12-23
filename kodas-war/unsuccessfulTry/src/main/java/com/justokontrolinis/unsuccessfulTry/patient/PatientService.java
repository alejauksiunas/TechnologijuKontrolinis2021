package com.justokontrolinis.unsuccessfulTry.patient;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {
	
	private final PatientRepository patientRepository;	

	@Autowired
	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	public List<Patient> getPatients() {
		return patientRepository.findAll();
	}
	
	public void addNewPatient(Patient patient) {
		Optional<Patient> patientOptional = patientRepository
				.findPatientByEmail(patient.getEmail());
		if (patientOptional.isPresent()) {
			throw new IllegalStateException("Blogas email");
		}
		patientRepository.save(patient);
	}

	public void deletePatient(Long patientId) {
		boolean exists = patientRepository.existsById(patientId);
		if (!exists) {
			throw new IllegalStateException("Nera tokio id");
		}
		patientRepository.deleteById(patientId);
	}
	
	@Transactional
	public void updatePatient(Long patientId, String name, String email) {
		Patient patient = patientRepository.findById(patientId)
				.orElseThrow(() -> new IllegalStateException("Nope, no id bro"));
		
		if(name != null && name.length() > 0) {
			patient.setName(name);
		}
		
		if(email != null && email.length() > 0) {
//			!Objects.equals(patient.getEmail(), email)
			patient.setName(email);
		}
	}
	
}
