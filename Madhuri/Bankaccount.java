package bankaccount;
public class Bankaccount {
	long accountid;
	String accountname;
	float accountbalance;
	float bankbalance;
	public Bankaccount(long accountid, String accountname, float accountbalance) {
		super();
		this.accountid = accountid;
		this.accountname = accountname;
		 this.accountbalance = accountbalance;
		
	}
	
public void  deposit(float accountbalance) {
	this.accountbalance=this.accountbalance+accountbalance;

}
public void withdraw(float accountbalance) {
	this.accountbalance=this.accountbalance-accountbalance;
}
public static void main(String args[]){
	Bankaccount b1=new Bankaccount(12345,"madhuri",10500);
	Bankaccount b2=new Bankaccount(760106,"madhu",17600);
	b1.deposit(500);
	b2.withdraw(900);
System.out.println(b1.accountid+" "+ b1.accountname+""+b1.accountbalance);
}
}
