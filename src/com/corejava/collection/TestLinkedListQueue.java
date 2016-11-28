package com.corejava.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Test the LinkedList implementation of Queue interface
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class TestLinkedListQueue {

	public static void main(String[] args) {

		Queue q = new LinkedList();

		// Add an element
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		q.add("Five");
		q.add("Six");
		q.add("Seven");

		// Examine top element
		Object ele = q.element();
		System.out.println("Top Element --->"+ele);

		// Remove an element
		ele = q.remove();

		System.out.println("Removed Element--->"+ele);

		// print all elements using Iterator. It does maintain insertion order
		// of elements
		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
