package it.my.TestOnline;

public class TestAB {

	public static void main(String[] args) {
		A a = new B();
		//B b = new A();
		
		
		B b = new B();
		A aa = b;
		B bb = (B) a;
		A aaa = new A();
		
		bb = (B) aaa;

	}

}
