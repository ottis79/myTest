package it.my.array.test;

public class W1 {
	static int i =2;
	public static void main(String[] args) {
		long [][] arrayL;
		long [] arrayl2 = {1,2,3};
		Object o = arrayl2;
		arrayL[0][0]= (long []) o;
	}

}
