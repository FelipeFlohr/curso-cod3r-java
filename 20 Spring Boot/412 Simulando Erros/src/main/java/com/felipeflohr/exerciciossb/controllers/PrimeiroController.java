package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define a classe como um Controller
public class PrimeiroController {

	@GetMapping(path = { "/ola", "/saudacao" }) // A annotation por si só se refere ao método GET.
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	// Simulando um erro de mapeação ambígua
	@GetMapping(path = "/saudacao") // Repare que este mesmo caminho está mapeado no método acima. Dessa maneira, ocorrerá um erro ao tentar acessar este endereço
	public String saudacao() {
		return "Olá Spring Boot!";
	}
	
	// É possível mapear dois métodos para o mesmo endereço, porém com métodos HTTP diferente
	@PostMapping(path = "/ola")
	public String ola2() {
		return "Olá Spring Boot!";
	}

	// Simulando um erro de método GET não suportado
	@PostMapping(path = "/olapost") // Se entrar nesse endereço, será exibido um erro de método GET não suportado
	public String olaPost() {
		return "Olá Spring Boot!";
	}
}
