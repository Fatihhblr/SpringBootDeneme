package com.example.deneme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class DenemeApplication {

	public static void main(String[] args) throws Exception { 
		SpringApplication.run(DenemeApplication.class, args);
	}

}
