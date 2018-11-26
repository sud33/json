package com.rbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.rbc.config","com.rbc.controller","com.rbc.model"})
public class SaveCreditApplicationAPISpec {

	public static void main(String[] args) {
		SpringApplication.run(SaveCreditApplicationAPISpec.class, args);
	}
}
