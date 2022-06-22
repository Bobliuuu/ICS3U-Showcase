// Import package
package com.ics3u.web;

// Import Spring Boot framework dependencies
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Specify the Main program to contain the Spring Boot application backend
public class WebsiteApplication {
	/**
	 * The main program will run the website from the Spring Boot application hosted backend
	 * @param args
	 */
	public static void main(String[] args) { // Main method
		SpringApplication.run(WebsiteApplication.class, args); // Run the Spring Boot application with the arguments provided from the methods
	}

}
