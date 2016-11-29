package com.corejava.thread;


/**
 * Message object is used by WaiterThread and NotifierThread.
 * 
 * WaiterThread get lock(monitor) on Message object and release lock by wait()
 * method.
 * 
 * NotifierThread notify back to WaiterThread to process the message by calling
 * notify() and notifyall() methods.
 * 
 * @version 1.0
 * @since 16 Nov 2016
 * @author Anil Vishvkarma
 * 
 */

public class Messages {

	private String msg;

	public Messages(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String str) {
		this.msg = str;
	}

}
