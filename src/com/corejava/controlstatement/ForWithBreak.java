package com.corejava.controlstatement;

/**
 * break statement to terminate a for loop.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class ForWithBreak {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		// Iterate array elements
		for (int n : numbers) {
			// Check if number is even
			if (n % 2 == 0) {
				System.out.println(n);
				break;// Terminate loop
			}
		}
	}
}
