package com.corejava.array;

/**
 * Copy array elements using java.lang.System
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class CopyAnArray {

	public static void main(String[] args) {

		char[] copyFrom = { 'A', 'N', 'I', 'L'};
		char[] copyTo = new char[4];

		/**
		 * Parameters of System.arraycopy() method are 
		 * Source Array, 
		 * Start Index of Source Array, 
		 * Target Array 
		 * Start Index of destination array 
		 * No of elements to be copied
		 */

		System.arraycopy(copyFrom, 1, copyTo, 0, 3);

		System.out.println(new String(copyTo));
		
	}
}
