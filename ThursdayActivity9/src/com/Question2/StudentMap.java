package com.Question2;
import java.util.Map;
import java.util.TreeMap;
public class StudentMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>s=new TreeMap<>();
		s.put(10,"B.tech-ECE" );
		s.put(15,"Medicine");
		s.put(20,"B.tech-CSE");
		s.put(25,"Bsc");
		s.put(30,"BEd");
		for(Map.Entry e:s.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		//copying treeMap s to treeMap s1
		
		TreeMap<Integer,String>s1=new TreeMap<>();
		s1.put(12,"B.Tech-Civil");
		s1.put(16,"B.Tech-Mechanical");
		s1.putAll(s);
		System.out.println(s1);
		
		//Search by key in treeMap
		if(s.containsKey(15))
		{
			System.out.println("yes it contains");
		}
		else
		{
			System.out.println("No it does not contain");
		}
        // search by value in treeMap
		if(s1.containsValue("B.Tech-IT"))
		{
			System.out.println("yes it contains");
		}
		else
		{
			System.out.println("No it does not contain");
		}
		//Sorting treeMap based on keys
				for(Map.Entry e:s1.entrySet())
				{
					System.out.println(e.getKey()+ " " + e.getValue());
					//Collections.reverseOrder(map);
				}
				
		
		//greatest key-value and least key-value in the treeMap
		System.out.println("Greatest key-value: "+s1.lastEntry());	
		System.out.println("Greatest key-value: "+s1.firstEntry());
		
		//reversing the treeMap s1 keys order
				Map<Integer,String>rev=s1.descendingMap();
				System.out.println(rev);
		
		//remove and get greatest key-value
				System.out.println("Greatest key-value: "+s1.pollLastEntry());
				
		// remove and get least key-value
				System.out.println("Least key-value: "+s1.pollFirstEntry());
				
	}

}