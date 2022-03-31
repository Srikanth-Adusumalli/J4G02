//ass5-Que2;

package assignment5;

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Hello World");
	}
}

public class PrintHelloWorldByRunnableInterface {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();		  
		Thread t = new Thread(myRunnable);
		t.start();
	}
}