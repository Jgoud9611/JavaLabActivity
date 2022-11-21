package com.question2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LongestWordInFile {

	public static void main(String[] args) throws FileNotFoundException{
		new LongestWordInFile().findLongestWord();
	  

	}
	public String findLongestWord() throws FileNotFoundException {
		String Longest_word=" ";
		String current;
		Scanner sc=new Scanner(new File("D:\\dummy.txt"));
		while(sc.hasNext()) {
			current=sc.next();
			if(current.length() > Longest_word.length()) {
				Longest_word = current;
			}
				
		}
		System.out.println(Longest_word);
		return Longest_word;
		
		
		
	}

}