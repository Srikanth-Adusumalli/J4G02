package Assesment;

public class checkoverriding {

	public void run(){
		System.out.println("you are parent class");
	}
	
	
}
class over extends checkoverriding
{
	public void run() {
		System.out.println("you are child class ");
	}
	
	public static void main(String args[]) {
	
	over ov=new over();
	
	ov.run();
  }
}
