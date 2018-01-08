package my.test.staticvariabile;

public class W2 {
	int x=y;
	static int y =10;
	public static void main(String[] args) {
		System.out.println(new W2().x);
		System.out.println(y);

	}
	static {
		y=200;
	}

}
