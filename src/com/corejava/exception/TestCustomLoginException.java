package com.corejava.exception;

/**
 * Tests custom LoginException class.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class TestCustomLoginException {

	public static void main(String[] args) {

		try {
			authenticate("ANIL", "ANIL");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void authenticate(String login, String pwd)
			throws LoginException {
		boolean flag = true;
		if (flag) {
			throw new LoginException();
		}
	}

}
