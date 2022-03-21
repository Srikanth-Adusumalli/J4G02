package com.Question1;

public class BankAccountMain {
	
	public static void main(String[] args) {
		
		BankAccount bank=new BankAccount(1,"rahul",1600.99);
		int withdrawAmount=500;
		System.out.println("withdrawAmount is "+ withdrawAmount);
		double d=bank.Withdraw(withdrawAmount);
		System.out.println("Available balance is "+d);
		
		int dipositeAmount=800;
		System.out.println("dipositeAmount is "+dipositeAmount);
		double ddd=bank.Deposite(dipositeAmount);
		System.out.println("available balance is "+ddd);
		
	}

}
