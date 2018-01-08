package it.my.StringBuider;

public class W1 {

	public static void main(String[] args) {
		char [] c = new char[]{'a','b','c'};
		String s1 = "abcde".substring(4);
		String s2 = new String(c);
		s1+=s2;
		System.out.println(s1);
	}

}
