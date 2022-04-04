package com.test.thread;

public class TestRunableInterface implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestRunableInterface tr = new TestRunableInterface();
		Thread th = new Thread(tr);
		th.start();

	}

	

}
