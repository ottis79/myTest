package it.my.array.test;

public class TestExam1 {

	public static void main(String[] args) {
		int array [] [] = {{1,2},{3,4}};	
		for(int i=0; i<array[0].length; i++){
			for(int j=0; j<array[i].length; j++)
				System.out.print(array[i][j]+" ");
			System.out.print("\n");
		}
		for(int i: array[0])
				System.out.print(i+" ");
		System.out.print("\n");
		for(int j : array[1])
			System.out.print(j+" ");
	}
}
