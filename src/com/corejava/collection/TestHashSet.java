package com.corejava.collection;

/**
 * Test the HashSet class
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet s = new HashSet();
		s.add("Zero");
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Five");

		// Print all elements using Iterator, It doesn’t maintain any order when
		// iterate elements from it.
		System.out.println("\nElements printed by Iterator");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}

	}
}
