package com.corejava.array;

/**
 * Prints the name of array class.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class ClassOfArray {

	public static void main(String[] args) {

		char[] myArray = { 'A', 'N', 'I', 'L'};
		String name = myArray.getClass().getName();
		System.out.println("Name of char[] array is " + name);

	}
}
