package it.my.testException;

import java.io.FileNotFoundException;

public class TestSibexException {
	public static void main(String []args){
		System.out.println("a");
		try{
			System.out.println("b");
			throw new ArrayIndexOutOfBoundsException(); 
		}catch(ArrayIndexOutOfBoundsException f){
			System.out.println("c");
		}
		catch(RuntimeException f2)
		{
			System.out.println("d");
		}finally
		{
			System.out.println("e");
		}
		System.out.println("f");
}}
