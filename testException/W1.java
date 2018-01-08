package it.my.testException;

public class W1 {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("one");
		} catch (IllegalArgumentException e) {
			System.out.println("illegalArgument");
		}
	}

}
