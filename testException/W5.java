package it.my.testException;

public class W5 {

	public static void main(String[] args) {
		Object i = Integer.valueOf(42);
		String s = (String)i; //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	}
}
