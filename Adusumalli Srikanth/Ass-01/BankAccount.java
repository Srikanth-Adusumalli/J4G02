package assignment;

public class BankAccount {
	
	int accountId;
	String accountName;
	double accountBal;
	double sumBal;
	
	
	public BankAccount(int accountId, String accountName, double accountBal) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBal = accountBal;
	}
	
	public static void main(String[] args) {
		BankAccount bal = new BankAccount(1, "srikanth",25000.00);
		bal.add(500);
		System.out.println("Id:   "+bal.accountId);
		System.out.println("Name:  "+bal.accountName);
		System.out.println("Balance:  "+bal.accountBal);
		
		System.out.println();
		
		bal.withdraw(1000);
		System.out.println("Id:   "+bal.accountId);
		System.out.println("Name:  "+bal.accountName);
		System.out.println("Balance:  "+bal.accountBal);
		
	}
	
	public void add(double amt) {
		accountBal = accountBal + amt;
	}
	public void withdraw(double amt) {
		this.accountBal = amt;
	}
	
}

 