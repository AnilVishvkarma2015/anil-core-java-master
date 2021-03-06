package com.corejava.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serialize an Externalized object and write to a file
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Anil Vishvkarma
 */

public class WriteExtObject {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("C:/object.ser");

		// Wrap file with ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Create objects and set values
		MarksheetBeanExt m = new MarksheetBeanExt();
		m.setName("Raju");
		m.setMaths(90);
		m.setPhysics(80);
		m.setChemistry(89);
		m.setTemp(99);

		System.out.println("Total Marks : " + m.getTotal());
		System.out.println("Percentage : " + m.getPercentage());

		// Serialize object
		out.writeObject(m);

		// Close the file
		out.close();

		System.out.println("Object is serialized and persisted.");
	}
}
