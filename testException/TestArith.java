package it.my.testException;

class TestArith {

	public static void main(String[] args) {
		try {
			int x=10/0;
		} catch (ArithmeticException e) {
			System.out.println("a");
		}
		catch (Exception e) {
			System.out.println("b");
		}
	}

}
