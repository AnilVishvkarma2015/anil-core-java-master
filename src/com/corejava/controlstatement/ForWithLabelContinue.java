package com.corejava.controlstatement;

/**
 * Labeled continue statement to continue outer loop.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class ForWithLabelContinue {

	public static void main(String[] args) {

		int[][] table = { { 1, 2 }, { 4, 6 }, { 3, 5 } };

		// Iterate rows
		outerFor: for (int[] row : table) {
			// Iterate row values
			for (int n : row) {
				// Check if number is odd
				// then go to next row
				if (n % 2 == 1) {
					continue outerFor;
				}
			}
			// Print row that has all even number
			System.out.println(row[0] + "," + row[1]);
		}
	}
}
