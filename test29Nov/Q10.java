package it.my.test29Nov;

public class Q10 { 
    public static void main(String args[]) { 
            StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
            s.append(s.delete(3, 6)); // the second index is escluded  
            System.out.println(s); 
            String ciao = "ciao";      
            System.out.println(ciao.substring(0, 2));  // the second index is escluded 
    } 
} 