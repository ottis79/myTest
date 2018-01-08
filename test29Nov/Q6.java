package it.my.test29Nov;

public class Q6 {
	public static void main(String args[]) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		// my code
		String s6 = new String("ottavio");
		String s7 = new String("ottavio");
		if (s6 == s7) // new String == don't work
			System.out.println("ok object equals");
		if (s3.equals(s4))
			System.out.println("ok");
		do
			System.out.println(s1.equals(s2));
		while (s3 == s4);
	}
}
// true printed in an infinite loop