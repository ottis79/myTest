package it.my.testException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFinallyThrow {
	public static void main(String[] args) {
		try {
			//method();
			method2();
		} catch (Exception e) {
			//System.out.println("FileNotFound");
		}
	}
	
	public static void method(){
		try {
			throw new NullPointerException(); 
		} catch (ClassCastException e) {
			// TODO: handle exception
		}finally {
			System.out.println("finally");
		}
		System.out.println("OCAJP");
	}
	
	public static void method2(){
		try {
			throw new NullPointerException(); 
		} catch (NullPointerException e) {
			// TODO: handle exception
		}finally {
			System.out.println("finally");
		}
		System.out.println("OCAJP");
	}
	

}
