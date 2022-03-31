package Assingment5;

public class Runable implements Runnable {

	public void run() {
		System.out.println("Hello World by implementing Runnable Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld2 h = new HelloWorld2();
		Thread t1 = new Thread();
		t1.start();

	}
}
