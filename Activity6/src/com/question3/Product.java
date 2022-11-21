package com.question3;


public class Product {
	void productCheck(int weight) throws MyException
		{
			if(weight<100)
			{
				throw new MyException("Product is Invalid");
			}
			else {
			
			System.out.println("product is valid : "+weight);
			}
		}
		

		public static void main(String[] args) {
			Product p1 = new Product();
			try {
			p1.productCheck(101);

			}
			catch(MyException me)
			{
				System.out.println("caught Exception");
				System.out.println(me.getMessage());
			}
		}

	}

