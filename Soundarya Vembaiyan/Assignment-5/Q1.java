//Ass-5:Q(1) Create a thread to print HelloWorld extending thread class
package modules5;

public class Q1 {
	
	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		Q1 h1 = new Q1();
		h1.start();
	}

	private void start() {

	}

}
