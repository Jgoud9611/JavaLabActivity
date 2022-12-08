package com.Question1;
import java.util.TreeSet;
public class TreeSetColours {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		//adding colors to the tree set
		t.add("Violet");
		t.add("Black");
		t.add("White");
		
		//printing elements of tree set
		System.out.println("Colors of first tree set are " + t);
		
			//Creating another tree set for colors
		TreeSet<String> t1 = new TreeSet<>();
		//adding colors to the 2nd tree set
		t1.add("Blue");
		t1.add("Red");
		t1.add("Green");
		t1.add("Orange");
		
		//printing 2nd tree set
		System.out.println("colors of second tree set  are: " + t1);
		
		//Adding the first tree set colors to second tree set colors
		System.out.println("Adding the 1st tree set colors to 2nd tree set:" );
		t1.addAll(t);
		System.out.println(t1);
		
		
		//reversing a tree set
		System.out.println("Reversed tree set is: " + t.descendingSet());
		
		//Comparing two tree sets
		
		boolean b = t.equals(t1);
		System.out.println("Are both sets equal?" + b);
		
		//Getting the first element in tree set
		System.out.println("The first element in tree set is " + t.pollFirst());
		
		//Getting the last element in the tree set
		
		System.out.println("The last element in the set is " + t.pollLast());
	}

}