package it.my.array.test;

import java.util.Arrays;

public class W2 {
	public static void main(String [] args){
		Integer [] array1 = {1,2,3};
		Integer [] array2 = {1,2,3};
		System.out.println(array1==array2);
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.deepEquals(array1, array2));
		
		
		int [] array3 = {1,2,3};
		int [] array4 = {1,2,3};
		System.out.println(array3==array4);
		System.out.println(Arrays.equals(array3, array4));
		//System.out.println(Arrays.deepEquals(array3, array4)); non si può fare perchè deepEquals accetta degli object non primitive
	}
}
