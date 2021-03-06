package com.corejava.thread;


/**
 * An example class that does not have thread concept
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class HelloWithoutThread {

	/**
	 * Name of thread
	 */
	private String name = null;

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 */
	public HelloWithoutThread(String name) {
		this.name = name;
	}

	/**
	 * Execute operation
	 */
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello  " + name);
		}

	}

	/**
	 * Test the example
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		HelloWithoutThread t1 = new HelloWithoutThread("Ram");
		HelloWithoutThread t2 = new HelloWithoutThread("Shyam");

		t1.run();
		t2.run();

		for (int i = 0; i < 50; i++) {
			System.out.println(i + " This is Main ");
		}

	}

}
