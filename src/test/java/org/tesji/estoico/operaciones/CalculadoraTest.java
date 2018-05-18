package org.tesji.estoico.operaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

//prueva de sumar 2 numeros
	@Test
	public void sumarTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(10,15);
		assertEquals(resultado, 25);	
	}
	@Test
	public void restaTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.restar(20,5);
		assertEquals(resultado, 15);
	}

}
