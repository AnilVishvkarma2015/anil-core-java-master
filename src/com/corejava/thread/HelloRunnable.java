package com.corejava.thread;


/**
 * An example thread class created by Runnable interface
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class HelloRunnable implements Runnable {

	/**
	 * Name of thread
	 */
	private String name = null;

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 */
	public HelloRunnable(String n) {
		this.name = n;
	}

	/**
	 * Execute thread operation
	 */
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i + "#" + name);
		}

	}

	/**
	 * Test concurrent thread
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Shyam"));
		t1.start();
		t2.start();
	}

}
