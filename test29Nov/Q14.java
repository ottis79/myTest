package it.my.test29Nov;

public class Q14 {
	public static void main(String args[]) {
		int num = 20;
		final int num2;
		num2 = 20;
		switch (num) {
		default:
			System.out.println("default");
		case num2:// non compila perchè il valore del case deve essere una
					// costante non basta la seconda assegnazione
			System.out.println(4);
			break;
		}
	}
}