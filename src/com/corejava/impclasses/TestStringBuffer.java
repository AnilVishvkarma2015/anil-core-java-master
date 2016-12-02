package com.corejava.impclasses;

import java.util.Date;

/**
 * Test Sting Buffer
 *
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public class TestStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This is Java");
		sb.append(",Java is OOP");
		sb.append(",Java is guarantee for Job");
		System.out.println(sb);

		//Date d = new Date();
		//System.out.println(d);

		long fifteenMin = 15 * 60 * 1000 ;
		Date d = new Date(fifteenMin);
		System.out.println(d);
		
		
	}

}
