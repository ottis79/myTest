package it.my.testException;

public class TestExc {

	public static void main(String[] args) {
		new TestExc().met();

	}
	
	public static void met() throws Exception{
		System.out.println("ciao");
	}

}
