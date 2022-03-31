package module4;

public class FirstRunnable implements Runnable {
	 
		public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			FirstRunnable m1=new FirstRunnable();  
		Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
		t1.start();  
		 }  
		}  
