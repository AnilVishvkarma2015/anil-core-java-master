package com.corejava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copy a Binary File using Buffered Input and Output stream classes
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class CopyBufferedBinaryFile {

	public static void main(String[] args) throws Exception {

		String source = "C:/Users/cvishva/Pictures/a.jpg";
		String target = "C:/Users/cvishva/Pictures/a.jpg";

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				source));

		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream(target));

		byte[] buff = new byte[256];

		int count = in.read(buff);// Read a byte array

		while (count > 0) {// 0 if EOF
			out.write(buff, 0, count);// Write a byte array
			count = in.read(buff);
			// Read a byte
		}
		out.close();
		in.close();
		System.out.println(source + " is copied to " + target);
	}

}
