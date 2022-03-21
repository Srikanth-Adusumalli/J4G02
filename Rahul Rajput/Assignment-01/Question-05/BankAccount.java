package com.Question1;

public class BankAccount {
	int accountId;
	String accountName;
	double accountBalance;

	public BankAccount(int accountId, String accountName, double accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;

	}

	public double Withdraw(int w) {
		accountBalance -= w;
		return accountBalance;
	}

	public double Deposite(int d) {
		accountBalance += d;
		return accountBalance;
	}


	
}
