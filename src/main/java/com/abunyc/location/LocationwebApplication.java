package com.abunyc.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@ComponentScan(basePackages = {"com.abunyc.location.service"})
public class LocationwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationwebApplication.class, args);
	}

}
