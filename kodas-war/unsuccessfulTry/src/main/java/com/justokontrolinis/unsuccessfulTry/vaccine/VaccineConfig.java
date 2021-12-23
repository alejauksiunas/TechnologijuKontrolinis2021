package com.justokontrolinis.unsuccessfulTry.vaccine;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaccineConfig {
	
	@Bean
	CommandLineRunner commandLineRunner2(VaccineRepository repository) {
		return args -> {
			VaccineBatch vakcina1 = new VaccineBatch(
					"Pfizer",
					1000
				);
			VaccineBatch vakcina2 = new VaccineBatch(
					"Moderna",
					2000
				);
			
			repository.saveAll(List.of(vakcina1, vakcina2));
		};
	}
}
