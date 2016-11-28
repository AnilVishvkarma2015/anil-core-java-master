package com.corejava.basic;


/**
 * Converts Primitive data into Strings.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class ConvertPrimitiveToString {
	public static void main(String[] args) {
		String btStr = String.valueOf(1);
		String shortStr = String.valueOf(2);
		String intStr = String.valueOf(3);
		String longStr = String.valueOf(4L);
		String floatStr = String.valueOf(5.5);
		String doubleStr = String.valueOf(5.5D);
		String boolStr = String.valueOf(true);
		
		System.out.println(" Byte String # " + btStr);
		System.out.println(" Short String # " + shortStr);
		System.out.println(" Int String # " + intStr);
		System.out.println(" Long String # " + longStr);
		System.out.println(" Float String # " + floatStr);
		System.out.println(" Double String # " + doubleStr);
		System.out.println(" Boolean String # " + boolStr);
		
	}
}
