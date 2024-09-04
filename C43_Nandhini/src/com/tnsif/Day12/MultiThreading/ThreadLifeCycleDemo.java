package com.tnsif.Day12.MultiThreading;

import com.tnsif.Day11.Thread_MultiThread.MyChildthread;

public class ThreadLifeCycleDemo {

public static void main(String args[]) {
	MyChildthread myThread=new MyChildthread();
	System.out.println("Before runable stage thread"+"is alive or not"+myThread.isAlive());
	myThread.start();
	try {
		Thread.sleep(4000);
	}
	catch(InterruptedException exp) {
		
	}
	
	
}

}