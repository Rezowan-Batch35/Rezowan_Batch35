package com.test.run;

import java.util.Arrays;

public class PracticeJavaCollectiion {
	
	public static void main(String[] args) {
		
		// 2,3,4,5,6
		// create an array
		int [] myArray = {2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(myArray));
		System.out.println("count =" + myArray.length);
		System.out.println("array to list" + Arrays.asList(myArray));
	// index = 4 value
		System.out.println(myArray[4]);
	}

}
