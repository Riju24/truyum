package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.cognizant")
public class TruyumApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruyumApplication.class, args);
	}

}
