package com.felipeflohr.exerciciossb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosSbApplication {

	// Desafio: criar mais dois atributos dentro de produtos: o preço (valor que tem que ser maior do que 0) e o desconto (valor entre 0 e 1)
	public static void main(String[] args) {
		SpringApplication.run(ExerciciosSbApplication.class, args);
	}

}
