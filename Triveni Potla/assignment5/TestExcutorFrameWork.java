package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExcutorFrameWork{

	 public static void main(String[] args) {  
	        ExecutorService executorService = Executors.newFixedThreadPool(5);  
	        for (int j = 0; j < 10; j++) {  
	            Runnable task = new Task1("" + j);  
	              
	            executorService.execute(task);  
	          }  
	        executorService.shutdown();  
	          
	        while (!executorService.isTerminated()) {  
	        }  
	        System.out.println("Finished all threads");  
	    }  

}
 class Task1 implements Runnable {  
    
    private String threadNo;  
      
    public Task1(String no){  
        this.threadNo = no;  
    }  
      
    //using run() method by overriding it  
    @Override  
    public void run() {  
        //printing thread information   
        System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);  
          
        //calling processThread() method for processing thread  
        processThread();  
          
        //printing a statement to show the end of the thread  
        System.out.println(Thread.currentThread().getName()+" stop execution.");  
    }  
      
    //creating processThread() method to execute thread  
    private void processThread() {  
        try {  
            Thread.sleep(5000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
      
    //overriding toString() method   
    @Override  
    public String toString(){  
        return this.threadNo;  
    }  
}  