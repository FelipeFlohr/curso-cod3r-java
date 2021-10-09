package com.felipeflohr.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		// Testar se um valor é o esperado
		int a = 1 + 1;
		assertEquals(2, a);
	}
	
	// Forçando uma falha
	@Test
	void testarSeIgualATres() {
		int x = 2 + 10 - 7;
		assertEquals(3, x);
	}

}
