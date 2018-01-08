package it.my.test29Nov;

class Q7 { 
    public static void main(String args[]) { 
        String s = "java2s"; 
        s.replace('a', 'Z').trim().concat("Aa"); 
        s.substring(0, 2); 
        System.out.println(s); 
    } // ricordati che la stringa è immutabile
} 