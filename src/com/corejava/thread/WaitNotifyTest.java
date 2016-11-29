package com.corejava.thread;


/**
 * Test class of wait() and notify() methods. Two class WaiterThread and
 * NotifierThread simulates the wait() and noify()/notifyall() situations to
 * acquire the lock on Message class object.
 * 
 * WaiterThread calls wait() and release lock on Message object. NotifierThread
 * calls notify()/notifyall() to awake WaiterThread objects and consume the
 * message.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 * 
 */
public class WaitNotifyTest {

	public static void main(String[] args) {

		Messages msg = new Messages("Process It");
		
		WaiterThread w1 = new WaiterThread("Ram", msg);
		WaiterThread w2 = new WaiterThread("Shyam", msg);
		w1.start();
		w2.start();

		NotifierThread notifier = new NotifierThread(msg);
		notifier.start();
		
		System.out.println("All threads are started");
	}

}