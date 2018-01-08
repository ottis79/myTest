package it.my.test29Nov;

public class Q13 {
	public static void main(String args[]) {
		// the expression that switch case permitt are byte, short, int, char, enum, String
		// and Wrapper class Byte, Short, Integer, Character
		byte foo = 120;
		switch (foo) {
		default:
			System.out.println("default");
			break;
		case 2:
			System.out.println("2");
			break;
		case 120:
			System.out.println("120");
		case 121:
			System.out.println("121");
		case 127:
			System.out.println("127");
			break;
		}
	}
}