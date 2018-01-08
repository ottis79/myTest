package it.my.mainTest;

public class W2 {
	private String code="1Z0-801";
	{System.out.println(code);}
	private static int question=90;
	static {System.out.println("question"+question);}
	static {question=-13;System.out.println("question"+question);}
	public W2(){
		System.out.println("costruttore");
	}
	public static void main(String[] args) {
		W2 w2 = new W2();

	}

}
