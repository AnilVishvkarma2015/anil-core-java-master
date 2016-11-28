package com.corejava.basic;

/**
 * A simple most example in JAVA that will print Hello World at console. This program will be your very first program in Java.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class FirstHelloWorld {
	public static void main(String[] args) {

		System.out.println("Hello World");

		// Define a string variable and run same program
		String name = "World";
		System.out.println("Hello " + name);

		// Print "Hello World" five times.
		int i = 0;
		while (i < 5) {
			System.out.println(i + " Hello World");
			i++;
		}

	}
}
