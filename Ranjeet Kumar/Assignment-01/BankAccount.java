package welcome.java;

public class BankAccount {
	int accountId;
	String accountName;
	double accountBalance;
	public BankAccount(int accountId , String accountName , double accountBalance) {
		this.accountId=accountId;
		this .accountName=accountName;
		this.accountBalance=accountBalance;
	}
	public static void main(String...args) {
		BankAccount check=new BankAccount(111,"R.k.singh",4567500.00);
		check.add(50980);
	System.out.println("BankId.....>"+"  "+ check.accountId);
	System.out.println("AccountName....>"+"  "+check.accountName);
	System.out.println("Available Balance....>"+ "  "+check.accountBalance);
	
	System.out.println();
	check.withdraw(10000);
	System.out.println("BankId.....>"+check.accountId);
	System.out.println("AccountName....>"+check.accountName);
	System.out.println("Available Balance....>"+check.accountBalance);
	}
	public void add(double atm) {
		accountBalance=accountBalance+atm;
	}
	public void  withdraw(double atm) {
		this.accountBalance-=atm;
	}

}
