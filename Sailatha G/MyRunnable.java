//ass5-que2
package assinment5;

class MyRunnable implements Runnable 
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
 public class PrintHelloWorldMyRunnableInterface {
	 public static void main(String[] args) {
		 MyRunnable myRunnable = new MyRunnable();
		 Thread t = new Thread(myRunnable);
		 t.start();
	 }
 }