package it.my.testException;

public class TestException1 {

	public static void main(String[] args) {
		try{
			throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			System.out.println("ill");
		}catch(Exception e){
			System.out.println("Exc");
		}finally{
			System.out.println("finally");
		}
		

	}

}
