package com.corejava.oop;
/**
 * Class TestShape
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author ANil Vishvkarma
 */
public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(5);
		c.setRadius(2);

		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
		System.out.println(c.area());

		Shape s = new Circle();

		s.setColor("Red");
		s.setBorderWidth(5);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}

}