package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	// Simulando um erro de mapeação ambígua
	@GetMapping(path = "/saudacao")
	public String saudacao() {
		return "Olá Spring Boot!";
	}
	
	// É possível mapear dois métodos para o mesmo endereço, porém com métodos HTTP diferente
	@PostMapping(path = "/ola")
	public String ola2() {
		return "Olá Spring Boot!";
	}

	// Simulando um erro de método GET não suportado
	@PostMapping(path = "/olapost")
	public String olaPost() {
		return "Olá Spring Boot!";
	}
}
