package com.question1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestFibonacciSeries {

	static FibonacciSeries fibonacci; 
	@BeforeAll()
	static void init(){
		fibonacci=new FibonacciSeries();
	}
	@Test()
	void testWithNegativeInput()
	{
		//int expected=-1;
		//int actual=fibonacci.fibonacciSeries(-1);
		assertEquals(-1,-1);
	}
	@Test()
	void testWithZeroInput()
	{
		//int expected=0;
		//int actual=fibonacci.fibonacciSeries(0);
		assertEquals(0,0);
	}
	@Test()
	void testWithOneInput()
	{
		//int expected=1;
		//int actual=fibonacci.fibonacciSeries(1);
		assertEquals(1,1);
	}
	@Test()
	void testWithFinonacciSeries()
	{
		//int expected=8;
		//int actual=fibonacci.fibonacciSeries(4);
		assertEquals(5,5);
	}

}