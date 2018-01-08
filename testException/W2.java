package it.my.testException;

public class W2 {
	static Integer i;
	public static void main(String[] args) {
		try{
			System.out.println(i.doubleValue());
		}catch(RuntimeException e){
			System.out.println(e.toString());
		}

	}

}
