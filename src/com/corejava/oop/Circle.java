package com.corejava.oop;

/**
 * Inherits Shape class and contains attributes of Circle.
 *
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class Circle extends Shape {

	/**
	 * Instance variable contains radius of Circle
	 */
	private int radius;

	/**
	 * PI is the constant
	 */
	public static final double PI = 3.14; // static variable

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Calculates area of Circle
	 */
	public double area() {
		double area = 0;
		area = PI * radius * radius;
		return area;
	}

}
