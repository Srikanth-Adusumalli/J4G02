package com.learnsjobs.assignment;

public class BankAccounts {

	 int accountId;
	static double accountBalance;
	String accountName;

	public BankAccounts(int accountId, String accountName, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	

	public void bankAccountDisplayInfohrmation() {
		System.out.println("the customer account details are" + ":" + this.accountId + "," + this.accountName + ","
				+ this.accountBalance);
	}

	public void deposit(double amount) {
		amount =2000;
		System.out.println("the deposit" + amount);

	}

	public void withdraw(double amount) {
		amount=2000;
		System.out.println("the withdraw" + amount);
	}

}