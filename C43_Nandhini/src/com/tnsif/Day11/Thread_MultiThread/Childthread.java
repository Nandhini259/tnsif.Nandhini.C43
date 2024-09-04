package com.tnsif.Day11.Thread_MultiThread;

//Thread class
public class Childthread extends Thread {
	private int n;
	private String msg;

	// Constructor
	public Childthread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted: " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}
}