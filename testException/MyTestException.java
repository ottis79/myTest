package it.my.testException;

public class MyTestException {
	
	public static void main (String []args){
		MyTestException my = new MyTestException();
		my.test();
	}
	
	public void test() throws IllegalArgumentException{
		try {
			//int n= 3/0; 
			throw new ArrayIndexOutOfBoundsException();
		}catch (IllegalArgumentException e){
			//}catch (Exception e){
			System.out.println("error");
		}
	}
}
