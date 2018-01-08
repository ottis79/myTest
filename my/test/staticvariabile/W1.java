package my.test.staticvariabile;

public class W1 {
	static int x=10;

	public static void main(String[] args) {
		W1 w1 = new W1();
		w1.x=5;
		System.out.println(x);

	}

}
