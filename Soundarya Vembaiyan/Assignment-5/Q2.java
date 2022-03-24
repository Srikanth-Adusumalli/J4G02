//Ass-5:Q(2) Create a thread to print HelloWorld by implementing runnable interface
package modules5;

public class Q2 implements Runnable {

	public static void main(String[] args) {
		Q2 ob = new Q2();
		Thread thread = new Thread(ob);
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}