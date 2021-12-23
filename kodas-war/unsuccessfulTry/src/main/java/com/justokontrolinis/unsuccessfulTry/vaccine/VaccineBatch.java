package com.justokontrolinis.unsuccessfulTry.vaccine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class VaccineBatch {
	
	@Id
    @SequenceGenerator(
            name = "vaccine_sequence",
            sequenceName = "vaccine_sequence",
            allocationSize = 1
    )
    
    @GeneratedValue(
            generator = "vaccine_sequence",
            strategy = GenerationType.SEQUENCE)
	
	private Long id;
	private String brand;
	private Integer quantity;
	
	public VaccineBatch() {
		
	}

	public VaccineBatch(Long id, String brand, Integer quantity) {
		super();
		this.id = id;
		this.brand = brand;
		this.quantity = quantity;
	}
	
	

	public VaccineBatch(String brand, Integer quantity) {
		super();
		this.brand = brand;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", brand=" + brand + ", quantity=" + quantity + "]";
	}
	
}
