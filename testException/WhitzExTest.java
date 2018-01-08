package it.my.testException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WhitzExTest {
	public static void main(String []args){
		try{
			method();
		}catch(IOException e){
			System.out.println("caugth");
		}
	}
	
	public static IOException method(){
		//try{
			return new IOException();
		//}catch(FileNotFoundException e){
		//	return new FileNotFoundException();
		//}
	}

}
