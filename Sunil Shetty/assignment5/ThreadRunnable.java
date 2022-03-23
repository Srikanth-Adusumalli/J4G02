package com.learnjobs.assignment;

public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnable td = new ThreadRunnable();
		Thread t= new Thread(td);
		//t.setName("week");
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("helloworld"+ " "+Thread.currentThread().getName());
	}

}
