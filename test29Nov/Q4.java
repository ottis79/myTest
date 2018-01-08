package it.my.test29Nov;

public class Q4 {
	  public static void main(String[] args) {
	    int i; /*from www . j  a  v  a 2s .c o m*/
	    int j; 
	    for (i=1; i < 4; i++) { 
	       for (j=2; j < 4; j++) { 
	          if (j == 3) { 
	             continue; 
	          } 
	          System.out.println("i: " + i + " j: " + j); 
	       } 
	    } 
	  }
	  /*
	   * What will be output by the following code?
	   * 	a.  i: 1 j: 2  
                i: 2 j: 2  
                i: 3 j: 2 

            b.  i: 1 j: 3  
                i: 2 j: 3  
                i: 3 j: 3 

            c.  i: 1 j: 1  
                i: 2 j: 1  
                i: 3 j: 1 
	   */
	}
