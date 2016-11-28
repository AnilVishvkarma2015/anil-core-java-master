package com.corejava.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Test the PriorityQueue implementation of Queue interface
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class TestPriorityQueue {

	public static void main(String[] args) {

		//Queue q = new LinkedList();
		Queue q = new PriorityQueue();

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
		System.out.println("Top ELement--->"+ele);

		// Remove an element
		ele = q.remove();
		System.out.println("Removed Element--->"+ele);

		// print all elements using Iterator. It does not maintain order of
		// elements
		System.out.println("Element List \n");

		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
