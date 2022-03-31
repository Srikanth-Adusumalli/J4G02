package com.Assignment5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemoMain {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new ExecutorFrameworkDemo());
	}

}
