package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.entity.ThemeParkRide;
import com.example.repository.ThemeParkRideRepository;

import lombok.extern.slf4j.Slf4j;

import javax.validation.Valid;

@Slf4j
@RestController
public class ThemeParkRideController {
	
    private Logger logger = LoggerFactory.getLogger(ThemeParkRideController.class);
    
	@Autowired
    private final ThemeParkRideRepository themeParkRideRepository;
	

	public ThemeParkRideController(ThemeParkRideRepository themeParkRideRepository) {
		this.themeParkRideRepository = themeParkRideRepository;
	}

	@GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<ThemeParkRide> getRides() {
		logger.info("getting rides details");
		return themeParkRideRepository.findAll();
	}

	@GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ThemeParkRide getRide(@PathVariable String id) {
		logger.info("searching rides details by id " +id);
		return themeParkRideRepository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid ride id %s", id)));
	}

	@PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ThemeParkRide createRide(@Valid @RequestBody ThemeParkRide themeParkRide) {
		logger.info("Saving rides details");
		return themeParkRideRepository.save(themeParkRide);
	}
}