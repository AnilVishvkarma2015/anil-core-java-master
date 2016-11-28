package com.corejava.system;


/**
 * Apply application security manager
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */

public class SystemSecurityManager {

	public static void main(String[] args)  {

		SecurityManager secManager = System.getSecurityManager();
		if (secManager == null) {
			System.out.println("SecurityManager is not configured");
		}
		SecurityManager mySecManager = new SecurityManager();
		System.setSecurityManager(mySecManager);

		secManager = System.getSecurityManager();
		if (secManager != null) {
			System.out.println("SecurityManager is configured");
		}
	}
}
