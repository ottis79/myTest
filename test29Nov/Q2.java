package it.my.test29Nov;

import java.util.ArrayList;

public class Q2 {
	
	/*
	 Which of the following statements can be used to determine if cat can be found in the list?
	 */

	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<>(); 
	         list.add("dog"); 
	         list.add("cat"); 
	         list.add("frog"); 
	         
	      System.out.println(list.contains("cat"));
	      System.out.println(list.indexOf("cat"));

	}

}
