package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define a classe como um Controller
public class PrimeiroController {

	// @RequestMapping(method = RequestMethod.GET, path = "/ola") <- Mapeia uma
	// requisição para este método. Por convenção, o método de requisição padrão é
	// GET. O caminho da requisição é "/ola"
	@GetMapping(path = { "/ola", "/saudacao" }) // A annotation por si só se refere ao método GET.
	public String ola() {
		return "Olá Spring Boot!";
	}
}
