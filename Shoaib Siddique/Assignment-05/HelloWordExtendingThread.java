package com.threadBasic;

public class HelloWordExtendingThread extends Thread {

		public void run() {
			System.out.println("Hello World Printing by extending thread class");
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HelloWordExtendingThread h1 = new HelloWordExtendingThread();
			h1.start();
			

		}

	}