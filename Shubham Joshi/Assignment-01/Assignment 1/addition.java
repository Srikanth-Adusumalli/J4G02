package Assesment;

public class addition {

	void sum(int a,int b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  public static void main(String args[]){  
		addition obj=new addition();  
		  obj.sum(20,20);//now second int literal will be promoted to long  
		  obj.sum(20,20,20);
}
}