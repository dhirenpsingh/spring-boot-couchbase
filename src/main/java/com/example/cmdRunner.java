package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.ThemeParkRide;
import com.example.repository.ThemeParkRideRepository;

@Component
public class cmdRunner implements CommandLineRunner {

	@Autowired
	ThemeParkRideRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * repository.save(new ThemeParkRide("Rollercoaster",
		 * "Train ride that speeds you along.", 5, 3)); repository.save(new
		 * ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
		 * repository.save(new ThemeParkRide("Teacups",
		 * "Spinning ride in a giant tea-cup.", 2, 4));
		 */
	}

}
