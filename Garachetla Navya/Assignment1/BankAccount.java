
import java.util.Scanner;
public class BankAccount {
public class Banking{
	String accno;
	String name;
	String acc_type;
	private long balance;
	Scanner sc = new Scanner(System.in);
	public void openAccount() {
		System.out.print("Enter Account No:");
		accno = sc.next();
		System.out.print("Enter Account type:");
		acc_type = sc.next();
		System.out.print("Enter Name:");
		name = sc.next();
		System.out.print("Enter Balance:");
	}
	public void showAccount() {
		System.out.println("Name of account holder:"+ name);
		System.out.println("Account no:" +accno);
		System.out.println("Account type:"+acc_type);
		System.out.println("Balance:" +balance);
	}
	public void deposite() {
		long amt;
		System.out.println("Enter the amount holder:"+name);
		amt = sc.nextLong();
		balance = balance + amt;
	}
	public void withdrawal() {
		long awt;
		System.out.println("Enter the amount you want to withdraw:");
		awt =sc.nextLong();
		if(balance >= amt) {
			balance = balance -amt;
			System.out.println("Balence after withdraw:");
		}else {
			System.out.println("your balance is less than" + amt +\tTransaction faild...!!");
		}
			
		}
}
}

	
		
		
	

