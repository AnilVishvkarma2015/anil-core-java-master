package com.corejava.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import com.corejava.oop.Person;

/**
 * gets the constructor details of a class using reflection API
 * 
 * @version 1.0
 ** @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class GetConstructorInfo {

	public static void main(String[] args) throws Exception {

		// Create instance
		Person person = new Person();
		Class c = person.getClass();
		System.out.println("Class Name : " + c.getName());

		// get class constructors
		Constructor[] constructors = c.getConstructors();
		System.out.println("Constructor information");

		// Iterate all constructors
		for (Constructor ctr : constructors) {
			System.out.println("\tName:" + ctr.getName());
			Class[] params = ctr.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tConstructor Parameter Types");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}
	}
}
