package com.corejava.oop;
/**
 * Class Doctor(Child Class) inherits the properties of Class Person (Parent Class)
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class Doctor extends Person {
	String registrationNo = null;

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

}
