package assignment1;

public class Calculator {
	public static void main(String[] args) {
		int[] data=new int[] {1,5,6};
		int sum=0;
		for(int i=0;i<data.length-1;i++) {
			sum=sum+data[i];
		}
		
		System.out.println(sum);
		
		
	}
	
	
	public int addNumbers(int x,int y)
	{
		return x+y;
	}
	
	
}
