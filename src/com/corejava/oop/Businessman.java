package com.corejava.oop;
/**
 * Class BusinessMan extends Class Person
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class Businessman extends Person {

	private double income = 0;

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
