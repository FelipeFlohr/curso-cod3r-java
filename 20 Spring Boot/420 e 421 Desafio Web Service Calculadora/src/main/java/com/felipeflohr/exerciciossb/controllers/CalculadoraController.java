package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	/* Criar um Controller de Calculadora com dois Web Services:
	 * 
	 * Web Serivce de somar:
	 *  /calculadora/somar/10/20
	 *  
	 * Web Service de subtrair:
	 *  /calculadora/subtrair?a=100&b=39
	 */

	@GetMapping(path = "/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(path = "/subtrair")
	public int subtrair(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
		return Integer.parseInt(a) - Integer.parseInt(b);
	}
}
