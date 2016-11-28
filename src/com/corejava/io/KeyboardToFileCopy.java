package com.corejava.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Reads text from keyboard and stores into a text file.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class KeyboardToFileCopy {

	public static void main(String[] args) throws Exception {

		// Open file
		FileWriter file = new FileWriter("C:/Users/cvishva/Pictures/file.txt");
		// Enable line by line write
		PrintWriter out = new PrintWriter(file);

		// Open keyboard
		InputStreamReader kb = new InputStreamReader(System.in);

		// Enable line by line read
		BufferedReader in = new BufferedReader(kb);

		// Read line from keyboard
		String line = in.readLine();

		// Exit loop if used types "quit"
		while (!line.equals("quit")) {
			out.println(line);// Write to file
			line = in.readLine();// Read next line
		}
		// Close streams
		file.close();
		out.close();
		kb.close();
	}

}
