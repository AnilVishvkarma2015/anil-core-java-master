package com.corejava.generics;
/**
 * A simple generic class that holds only Numbers, T is a type parameter and
 * Upper Bound to Number
 *
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class NumberData<T extends Number> {

	// declare an object of type T
	T value;

	// pass the parameter of type T.
	public NumberData(T val) {
		value = val;
	}

	/**
	 * @return Object
	 */
	T getValue() {
		return value;
	}

	/**
	 * Show data type of stored object
	 */
	void showType() {
		System.out.println("Type of T is " + value.getClass().getName());
	}

	public static void main(String[] args) {
		NumberData<Integer> iData = new NumberData<Integer>(5);
		NumberData<Double> dData = new NumberData<Double>(5.5);
		iData.showType();
		dData.showType();
		// NumberData<String> sData = new NumberData<String>("5.5");//Incorrect
	}
}
