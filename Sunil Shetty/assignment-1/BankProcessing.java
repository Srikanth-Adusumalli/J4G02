package com.learnsjobs.assignment;

public class BankProcessing {

	public static void main(String[] args) {

		BankAccounts[] bankaccount = { new BankAccounts(20, "sunilshetty", 4500), new BankAccounts(12, "anil", 2002),
				new BankAccounts(23, "hari", 1200) };

		double sum = 0;

		for (BankAccounts bankaccounts : bankaccount) {

			bankaccounts.bankAccountDisplayInfohrmation();

			sum = sum + bankaccounts.accountBalance;

		}
	
		System.out.println("the Total bank balance is:" + sum);

	}
}
