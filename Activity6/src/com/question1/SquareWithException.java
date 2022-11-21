package com.question1;

import java.util.Scanner; 
public class SquareWithException {
	void squareCheck(int a)throws OutofRangeException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to find Square");
		int a1=sc.nextInt();
		
		if(a1>10 && a1<50)
			throw new OutofRangeException("Out of Range");
		else
			throw new OutofRangeException("Square of a number is"+a1*a1);
	}

	public static void main(String[] args) {
		SquareWithException s=new SquareWithException();
		try {
			
				s.squareCheck(1);		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}