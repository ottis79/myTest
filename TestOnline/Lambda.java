package it.my.TestOnline;

import java.util.Arrays;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		 
	      List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
	 
	      strings.forEach((String s) -> System.out.print(s));
	      
	      strings.forEach(s -> System.out.print(s));
	 
	   }
}
