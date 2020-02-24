package com.intiformation.cours_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author IN-BR-028
 *
 */
public class CalculatorTest {

	
	private Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator ();
	}

	@After
	public void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	public void testAdd() {
		assertEquals("Est ce que l'addition est correcte", 10, calculator.add(5,5));
	}
	
	@Test
	public void testMul() {
		assertEquals("Est ce que l'addition est correcte", 25, calculator.mul(5,5));
	}
	

}
