package it.my.mainTest;

public class DoubleTest {

	public static void main(String[] args) {
		Double d = 10.0/0.0;
		System.out.println(d.isInfinite());
		Double d2=10D;
		long l = 10L;
		Float f = 100.20F;
		Float f2 = 100F;	
	}

}
