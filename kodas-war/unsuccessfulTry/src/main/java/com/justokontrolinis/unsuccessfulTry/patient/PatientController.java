package com.justokontrolinis.unsuccessfulTry.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v2/patient")
public class PatientController {
	
	private final PatientService patientService;
	
	@Autowired
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@GetMapping
	public List<Patient> getPatients() {
		return patientService.getPatients();
	}
	
	@PostMapping
	public void registerNewPatient(@RequestBody Patient patient) {
		patientService.addNewPatient(patient);
	}
	
	@DeleteMapping(path = "{patientId}")
	public void deletePatient(@PathVariable("patientId") Long patientId) {
		patientService.deletePatient(patientId);
	}
	
	@PutMapping(path = "{patientId}")
	public void updatePatient(
			@PathVariable("studentId") Long patientId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String email) {
		patientService.updatePatient(patientId, name, email);
		}
}
