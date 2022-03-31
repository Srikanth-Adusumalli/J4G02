package com.Runnable;

public class RunnableDemoMain {
	public static void main(String[] args) {
		Runnable rd=new RunnableDemoTest();
		Thread t=new Thread(rd);
	}

}
