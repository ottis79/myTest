package it.my.testException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException2 {
	public static void main(String []args){
		try{
			method();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFound");
		}catch(IOException e){
			System.out.println("IOExc");
		}
	}
	
	public static void method() throws IOException{
		throw new FileNotFoundException();	
	}

}
