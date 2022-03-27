//assignment-5 qu-1 
//by using thread
package threadbasics;

public class HelloWorld extends Thread {
	public void run() {
		System.out.println("Hello World by extending thread class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h1 = new HelloWorld();
		h1.start();
		

	}

}
