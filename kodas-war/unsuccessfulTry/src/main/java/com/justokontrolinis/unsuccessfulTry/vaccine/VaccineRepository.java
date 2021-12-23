package com.justokontrolinis.unsuccessfulTry.vaccine;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineBatch, Long>{
	Optional<VaccineBatch> findVaccineByBrand(String brand);
}
