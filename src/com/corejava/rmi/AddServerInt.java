package com.corejava.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the remote interface of RMI Server. Interface declares methods those
 * are accessed remotely.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 */
public interface AddServerInt extends Remote {
	/**
	 * returns sum of two numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws RemoteException
	 */
	public int sum(int a, int b) throws RemoteException;
}
