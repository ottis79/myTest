package it.my.array.test;

public class W3 {

	public static void main(String[] args) {
		int array [][] = {{1,3,5},{7,8}};
		out:for(int a[]:array)
			for(int i:a){
				if (i==7) continue;
					System.out.println(i);
				if (i==3) break;
			}
		//System.out.print(); //attenzione non esiste senza par in ingresso....

	}

}
