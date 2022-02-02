package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// TO DO Build from Jenkins and again commit
		System.out.println("in spring project first commjit to git ");
		SpringApplication.run(DemoApplication.class, args);
	}

}
