package it.my.testException;

import javax.management.RuntimeErrorException;

public class W3 {

	public static void main(String[] args) {
		try{
			System.out.println("A");
			throw new RuntimeException();
		}catch(RuntimeException e){
			System.out.println("b");
		}catch(Exception e2){
			System.out.println("c");
		}finally{
			System.out.println("f");
		}

	}

}
