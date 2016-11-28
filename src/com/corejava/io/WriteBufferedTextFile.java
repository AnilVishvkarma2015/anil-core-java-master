package com.corejava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Writes buffered character stream to a Text File. BuffredWriter and
 * PrintWriter class objects can be used for efficient writing.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author ANil Vishvkarma
 */

public class WriteBufferedTextFile {

	public static void main(String[] args) throws Exception {

		System.out.println("Write to a Text file char by char");

		// Open a file
		FileWriter file = new FileWriter("C:/test11.txt");
		BufferedWriter out = new BufferedWriter(file);
		char[] cArray = { 'H', 'i' };
		out.write(cArray); // write char array
		out.write(','); // write a char
		out.write("ANIL"); // write string
		out.close();
		file.close();
	}

}
