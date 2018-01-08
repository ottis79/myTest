package it.my.ArgClass;

public class WhitzLab {

	public static void main(String[] args) {
		args= new String []{"0","2"};
		try {
			int x = args.length;
			int v = 10 / x;
			System.out.println(x);
			try {
				if (x == 1)
					x = x / x - x;
				if (x == 2) {
					int[] c = { 2 };
					c[3] = 3;
				}
			}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("out of bounds");
			}
		} catch (ArithmeticException e2) {
			System.out.println("aritmetic");
		
	}

}
