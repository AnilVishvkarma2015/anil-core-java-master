package com.corejava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Writes text using PrintWriter class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Anil Vishvkarma
 */

public class WritePrintWriterTextFile {

	public static void main(String[] args) throws Exception {
		System.out.println("Write to a Text file using PrintWriter");
		// Open a file
		FileWriter file = new FileWriter("C:/testOne.txt");
		PrintWriter out = new PrintWriter(file, true);
		out.println("Line 1");
		out.println("Line 2");
		out.println("Line 3");
		out.close();
		file.close();
	}

}
