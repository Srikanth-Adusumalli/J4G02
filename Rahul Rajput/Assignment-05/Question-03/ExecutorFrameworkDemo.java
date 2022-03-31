package com.Assignment5;

public class ExecutorFrameworkDemo implements Runnable {

	public void run() {
		System.out.println("Printing numbers from 1 to 10");
		for (int i = 1; i <= 10; i++)
			System.out.print(i + " ");
	}
}
