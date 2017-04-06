package com.websystique.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.websystique.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = { "com.websystique.springboot" })
// same
// as
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan

public class SpringBootCRUDApp {
	public static final Logger logger = Logger.getLogger(SpringBootCRUDApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
