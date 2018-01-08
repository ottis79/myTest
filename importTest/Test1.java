package it.my.importTest;

import static java.util.Locale.*;
import it.my.TestOnline.TestUtility;

public class Test1 {

	public static void main(String[] args) {
		
		//int n = max(10,20);
		//int a = abs(10);
		int a = Math.abs(10); // the package java lang is imported by default
		System.out.println(ITALY);
		TestUtility.printI();
	}
}
