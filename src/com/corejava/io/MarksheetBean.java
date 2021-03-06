package com.corejava.io;

import java.io.Serializable;

/**
 * An serialized class contains Marskeet data of a student.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class MarksheetBean implements Serializable {

	String name = null;
	int maths = 0;
	int physics = 0;
	int chemistry = 0;

	// transient variables will not be serialized

	/**
	 * total is a calculated transient field,
	 */
	transient int total = 0;

	/**
	 * Percentage is a calculated transient field
	 */
	transient double percentage = 0;

	/**
	 * Transient temporary variable
	 */
	transient int temp = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	/**
	 * Calculates total
	 * 
	 * @return
	 */
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	/**
	 * Calculates percentage
	 * 
	 * @return
	 */
	public double getPercentage() {
		percentage = total / 3;
		return percentage;
	}

}
