package com.question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalci
{
	static Calci c;

	@BeforeAll()
	static void init(){
		c=new Calci();
	}
	
		
	@Test
	void testAddition()
	{
		int expected=30;
		int actual=c.addition(10, 20);
		assertEquals(expected,actual,"addition of 10 and 20 is 30");
		
	}
	@Test
	void testSubtraction()
	{
		int expected=10;
		int actual=c.subtraction(20, 10);
		assertEquals(expected,actual,"subtraction of 20 and 10 is 10");
		
	}
	@Test
	void testMultiplicaion() {
		int expected=10;
		int actual=c.multiplication(2,5);
		assertEquals(expected,actual,"multiplication of 2 and 5 is 10");
		
	}
	@Test
	void testDivision() {
		int expected=2;
		int actual=c.division(4, 2);
		
		assertEquals(expected,actual,"division of 4 and 2 is 2");
	}
}
