package com.justokontrolinis.unsuccessfulTry.patient;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfig {
	
	@Bean
	CommandLineRunner commandLineRunner1(PatientRepository repository) {
		return args -> {
			Patient pacientas1 = new Patient(
					"Petris",
					"petris@gmail.com",
					LocalDate.of(2001, Month.FEBRUARY, 2)
				);
			Patient pacientas2 = new Patient(
					"Mantelis",
					"mantelis@gmail.com",
					LocalDate.of(2000, Month.JANUARY, 1)
				);
			
			repository.saveAll(List.of(pacientas1, pacientas2));
		};
	}
}
