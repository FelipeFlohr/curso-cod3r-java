package com.felipeflohr.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeflohr.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes") // O RequestMapping faz com que toda a requisição dessa classe esteja atrelada ao caminho "/clientes", dessa maneira, para acessar o método obterCliente(), será necessário ir no endereço "clientes/qualquer"
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00"); // Irá retornar um JSON
	}
}
