package assignment1;

public class BankAccount {
	
	int accountId;
	String accountName;
	double accountBalance;
	
	public void deposit(double amount)
	{
		accountBalance = accountBalance+amount;
		System.out.println("Account Balance "+accountBalance);
	}
	
	public void withdraw(double amount)
	{
		accountBalance = accountBalance+amount;
		System.out.println("Account Balance "+accountBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.deposit(333.5);
		b.withdraw(3000.67);
				

	}

}
