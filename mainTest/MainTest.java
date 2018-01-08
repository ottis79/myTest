package it.my.mainTest;

public class MainTest {
	public static void main (int[]arg){
		System.out.println("main1");
	}
	
	public static void main (String ...c){
		System.out.println("main2");
	}
	
	public static void main (String c){
		System.out.println("main3");
	}
}
