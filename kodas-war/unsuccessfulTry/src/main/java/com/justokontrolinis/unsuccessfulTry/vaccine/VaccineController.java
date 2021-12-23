package com.justokontrolinis.unsuccessfulTry.vaccine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/vaccine")
public class VaccineController {
	
	private final VaccineService vaccineService;
	
	@Autowired
	public VaccineController(VaccineService vaccineService) {
		this.vaccineService = vaccineService;
	}
	
	@GetMapping
	public List<VaccineBatch> getVaccines() {
		return vaccineService.findAllVaccines();
	}
	
	@PostMapping
	public void addNewVaccines(@RequestBody VaccineBatch vaccine) {
		vaccineService.addNewVaccine(vaccine);
	}
	
	@DeleteMapping(path = "{vaccineId}")
	public void deleteVaccine(@PathVariable("vaccineId") Long vaccineId) {
		vaccineService.deleteVaccine(vaccineId);
	}
}
