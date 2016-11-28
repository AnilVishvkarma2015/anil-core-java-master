package com.corejava.exception;

/**
 * Custom checked exception class. It is checked because it inherits Exception
 * class.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class LoginException extends Exception {

	/**
	 * Default constructor
	 */
	public LoginException() {
		super("Invalide User ID/Password");
	}
}
