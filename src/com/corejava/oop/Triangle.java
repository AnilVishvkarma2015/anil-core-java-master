package com.corejava.oop;

/**
 * Inherits Shape class and contains attributes of Triangle.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class Triangle extends Shape {

	/**
	 * Base of Triangle
	 */
	private int base;

	/**
	 * Height of Triangle
	 */
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Calculates area of Rectangle
	 */
	public double area() {

		return (base * height) * 1 / 2;
	}

}
