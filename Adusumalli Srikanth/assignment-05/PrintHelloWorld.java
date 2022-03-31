//ass5-Que01;

package assignment5;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
public class PrintHelloWorld {

	public static void main(String[] args) {
		MyThread thread = new MyThread();		  
		thread.start();						 
	}
}
