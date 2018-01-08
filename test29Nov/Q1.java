package it.my.test29Nov;

public class Q1{ 
    private int i = 1; 
    public static void main(String argv[]){ 
       int i = 2; 
       Q1 s = new Q1 (); 
       s.someMethod(); 
    } 
    public static void someMethod(){ 
       System.out.println(i); 
    } 
    
    /*

    What will happen when you compile and run the following code?
    
    	1 will be printed out
		2 will be printed out
		3 A compile time error will be generated
		4 An exception will be thrown
		
		3 -> because the method static someMethod cannot use the i non static
    */
  } 



