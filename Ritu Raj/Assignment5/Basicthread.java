package Assingment5;

public class Basicthread extends Thread {
	public void run() {
		System.out.println("Hello World by extending thread class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h1 = new HelloWorld();
		h1.start();
		

	}
}
