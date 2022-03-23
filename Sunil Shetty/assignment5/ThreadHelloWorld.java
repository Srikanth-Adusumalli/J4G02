package com.learnjobs.assignment;

public class ThreadHelloWorld extends Thread  {
	
	 public void run() {
		 System.out.println("hello world"+ "  "+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadHelloWorld td=new ThreadHelloWorld();
		td.start();
	}

}
