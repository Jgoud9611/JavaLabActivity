package com.Question1;

import java.util.Scanner;

public class Division {
	public static int Divide(int a,int b)
	{
		int c=0;
		try
		{
			 c=a/b;
			 System.out.println(c);
			 
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
				
		}
		return c;
		
	}	
		
	public static void main(String[] args) {
		
			System.out.println("Enter first number: ");
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
			
			System.out.println("Enter second number: ");
			int y=s.nextInt();
			
			int res=Divide(x,y);
			System.out.println(res);
			
	
	     }
		
		
	}