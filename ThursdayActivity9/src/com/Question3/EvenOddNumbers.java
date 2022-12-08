package com.Question3;
class EvenNumThread extends Thread
{
	public void run()
	{
		System.out.println("The even numbers between 1 and 10 numbers are:");
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class OddNumThread extends Thread
{
	public void run()
	{
		System.out.println("The odd numbers between 1 and 10 numbers are:");
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}

public class EvenOddNumbers {

	public static void main(String[] args) {
		EvenNumThread et=new EvenNumThread();
		OddNumThread ot=new OddNumThread();
		et.start();
		System.out.println("     ");
		ot.start();

	}

}