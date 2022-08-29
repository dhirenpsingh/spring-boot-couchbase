package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @EnableCouchbaseRepositories(basePackages = {"com.example.repository.*"})
 * 
 * @ComponentScan(basePackages = { "com.exmaple.*" })
 * 
 * @EntityScan(basePackages = {"com.example.entity"})
 */
public class SpringBootApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiExampleApplication.class, args);
	}


}
