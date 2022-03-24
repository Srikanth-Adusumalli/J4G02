package com.Assignment5;

public class RunnableDemoMain {

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();

	}

}
