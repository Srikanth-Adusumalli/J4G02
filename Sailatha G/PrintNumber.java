//ass5-que3
package assinment5;

import java.util.concurrent.ExecutorService;


public class PrintNumber implements Runnable
{
	public void run() {
		System.out.println("Printing numbers from 1 to 10");
		for(int i=1;i<=10;i++)
			System.out.println(i+" ");
	}
}
 public class PrintNumbersByExecutorFramework {
	 
	 public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();
		 service.execute(new printNumbers());
	 }
 }