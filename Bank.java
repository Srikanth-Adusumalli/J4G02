
public class Bank {


//public class BankAccount {	
	long accountId;
	String accountName;
	double accountBalance;
	public Bank(long accountId, String accountName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double amount) {
		double newBalance = accountBalance + amount;
		accountBalance = newBalance;
	}
	
	public void withdraw(double amount) {
		double newBalance = accountBalance - amount;
		accountBalance = newBalance;
				
	}
	
	public void displayBankAccount() {
		System.out.println(accountId+" "+accountName+" "+accountBalance);
	}
	
	

}