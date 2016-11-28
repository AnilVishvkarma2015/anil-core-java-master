package com.corejava.enumeration;

/**
 * Enum class contains Human constants
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public enum Human {

	KID(10), MAN(50), OLDMAN(70);

	private final int weight;

	Human(int w) {
		this.weight = w;
	}

	public void display() {
		System.out.println(weight);
	}

	public static void main(String[] args) {

		Human h = Human.KID;
		h.display();

		Human[] hs = Human.values();

		for (int i = 0; i < hs.length; i++) {
			System.out.println(hs[i]);
		}

	}
}
