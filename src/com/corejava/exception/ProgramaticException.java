package com.corejava.exception;

/**
 * Throws an programmatic exception
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class ProgramaticException {

	public static boolean isValidUser() {
		// Always return false to test exception
		return false;
	}

	public static void main(String[] args) {

		// Check if user is valid
		boolean userFound = isValidUser();

		if (userFound) {
			System.out.println("Valid User");
		} else {
			// instantiate and raise an exception
			RuntimeException e = new RuntimeException("Invalid User");
			throw e;
		}
	}

}
