package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import com.example.entity.ThemeParkRide;
import com.example.repository.ThemeParkRideRepository;

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
