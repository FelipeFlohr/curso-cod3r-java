package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.felipeflohr.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes") // O RequestMapping faz com que toda a requisição dessa classe esteja atrelada ao caminho "/clientes", dessa maneira, para acessar o método obterCliente(), será necessário ir no endereço "clientes/qualquer"
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00"); // Irá retornar um JSON
	}

	// Dando parâmetros aos métodos
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) { // Utilizando RequestParam, será necessário seguir as regras do protocolo HTML para fazer a requisição: utiliza-se "/clientes?id={numero do id}"
		return new Cliente(id, "João", "111.222.333-44");
	}
}
