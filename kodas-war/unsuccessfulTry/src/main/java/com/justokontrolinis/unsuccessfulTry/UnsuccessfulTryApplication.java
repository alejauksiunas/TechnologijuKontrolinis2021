package com.justokontrolinis.unsuccessfulTry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UnsuccessfulTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnsuccessfulTryApplication.class, args);
	}

}
