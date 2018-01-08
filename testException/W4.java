package it.my.testException;

public class W4 {
	static Integer i;
	public static void main(String[] args) {
		try{
			int x=10;
			System.out.println(x/i.intValue());
		}catch(ArithmeticException|NullPointerException e){
			System.out.println(e.getClass().getSimpleName());
		}
		

	}

}
