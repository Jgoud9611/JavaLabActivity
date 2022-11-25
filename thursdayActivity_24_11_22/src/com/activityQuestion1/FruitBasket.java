package com.activityQuestion1;
import java.util.ArrayList;
import java.util.Iterator;

public class FruitBasket {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		//using Enhanced for loop or for-each loop
		for(String s:fruits) {
			System.out.println(s);
		}
		
		ArrayList<String> fruits1 =new ArrayList<>();
		fruits1.add("watermelon");
		fruits1.add("strawberry");
		fruits.addAll(fruits1);
		//traversing arrayList elements using iterator
		Iterator itr=fruits1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		fruits.remove(0);//to remove particular element by index
		fruits.removeAll(fruits1);//to remove all elements in fruits1
	    Collections.replaceAll(fruits1,"watermelon","cherry");
		
		System.out.println(fruits1);
		
		System.out.println(fruits);
		
		
	}

}