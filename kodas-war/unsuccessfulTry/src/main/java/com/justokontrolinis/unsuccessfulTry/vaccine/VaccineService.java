package com.justokontrolinis.unsuccessfulTry.vaccine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineService {
	
	private final VaccineRepository vaccineRepository;
	
	@Autowired
	public VaccineService(VaccineRepository vaccineRepository) {
		this.vaccineRepository = vaccineRepository;
	}
	
	public List<VaccineBatch> findAllVaccines() {
		return vaccineRepository.findAll();
	}
	
	public void addNewVaccine(VaccineBatch vaccine) {
		if(vaccine.getQuantity() <= 0) {
			throw new IllegalStateException("Fatal vaccine quantity error");
		}
		vaccineRepository.save(vaccine);
	}
	
	public void deleteVaccine(Long vaccineId) {
		boolean exists = vaccineRepository.existsById(vaccineId);
		if (!exists) {
			throw new IllegalStateException("No vaccine");
		}
		vaccineRepository.deleteById(vaccineId);
	}
}
