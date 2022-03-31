//ass05-Que3;

package assignment5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class PrintNumbers implements Runnable
{
	
	public void run() {
		System.out.println("Printing numbers from 1 to 10");
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}

public class PrintNumbersByExecutorFramework {
	
	public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();	
		 service.execute(new PrintNumbers());		
	}
}