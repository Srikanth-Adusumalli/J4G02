
class  MyThread<Public> extends Thread{
	public void run()
	{
		System.out.println("Hello World");
	}
}
Public class PrintHelloWorld{
	public  static void main(String[]args) {
		MyThread thread = new MyThread();
		
	}
}