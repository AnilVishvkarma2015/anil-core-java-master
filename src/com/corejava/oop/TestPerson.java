package com.corejava.oop;

/**
 * Test the Person class.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class TestPerson {

	/**
	 * Creates instance of Person class. Sets values in its instance variables
	 * by calling its methods. Gets the values by calling methods and print on
	 * console
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = null; // declare an object
		p = new Person(); // Instantiate

		// Call methods and set values
		p.setName("Anil");
		p.setAddress("MG Road");

		// Get values and print
		System.out.println("Name : " + p.getName());
		System.out.println("Address : " + p.getAddress());

	}

}
