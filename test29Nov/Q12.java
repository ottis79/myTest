package it.my.test29Nov;

//What's the output of the following code
public class Q12 {
	  public static void main(String args[]) {
	    int i = 0;
	    for (; i < 2; i = i + 5) {
	      if (i < 5)
	        continue;
	      System.out.println(i);
	    }
	    System.out.println(i);
	  }
	}

	/*    a  Compilation error 

	    b   0 
	        5 

	    c   0 
	        5 
	        10 

	    d   10 

	    e   0 
	        1 
	        5 

	     f  5 
	     */
