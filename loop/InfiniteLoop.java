package it.my.loop;

public class InfiniteLoop {

	public static void main(String [] args){
		int []a = {1,2,3,4,5,6};
		int i = a.length-1;
		while(i>=0){
			if (i%2!=0){
				System.out.println(a[i]);
				i--;
			}
		}
	}
}
