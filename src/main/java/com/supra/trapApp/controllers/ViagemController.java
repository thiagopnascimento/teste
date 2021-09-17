package com.supra.trapApp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supra.trapApp.model.Trip;
import com.supra.trapApp.repositories.TripRepository;

@RestController
@RequestMapping("/viagens")
public class ViagemController {
	
	@Autowired
	private TripRepository viagemRepository;
	
	@GetMapping
	public Optional<Trip> listar () {
		return viagemRepository.findById((long) 1);
	}
}
