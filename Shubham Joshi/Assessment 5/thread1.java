
public class thread1  extends Thread {

	public void run() {
		System.out.println("thread1 by extending thread class");
		}
		
		

		public static void main(String[] args) {
			
			thread1 h1 = new thread1();
			h1.start();
			

		}
	}
