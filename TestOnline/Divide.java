package it.my.TestOnline;

public class Divide {
	public void divide(int a, int b) {
		try {
			int c = a / b;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) {
		Divide d = new Divide();
		d.divide(1, 0);
	}
}
