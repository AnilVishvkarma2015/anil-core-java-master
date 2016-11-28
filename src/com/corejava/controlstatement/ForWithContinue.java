package com.corejava.controlstatement;

/**
 * Continue statement to print all even numbers
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class ForWithContinue {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		// Iterate array elements
		for (int n : numbers) {
			// Check if number is odd then
			// skip rest statements
			if (n % 2 > 0) {
				continue;
			}
			System.out.println(n);
		}
	}

}
