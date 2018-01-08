package it.my.cast;

public class TestAB {

	public static void main(String[] args) {
		A a = new A();
		A a2 = new B();
		B b = new B();
		System.out.println(a.chiSono());
		System.out.println(a2.chiSono());
		System.out.println(b.chiSono());
		B b3 = (B)a2; // ok il cast
		a = (B)b; //ok
		b = (B) a; //ok
		B b4 = (B) new A();
	}

}
