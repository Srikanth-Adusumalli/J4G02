
public class BankAccount {
	int accountId;
	String accountName;
	double accountBal;
	double sumBal;
	
	    public BankAccount(int accountId,String accountName,double accountBal) {
	    	super();
	    	this.accountId=accountId;
	         this.accountName=accountName;
	         this.accountBal=accountBal;
	    }
	

	public static void main(String[] args) {
		BankAccount bal=new BankAccount(1,"Akhila",5000.00);
		bal.add(200);
		System.out.println("Id:      "+bal.accountId);
		System.out.println("Name:      "+bal.accountName);
		System.out.println("Balance:      "+bal.accountBal);
		
		
		System.out.println();
		
		
		System.out.println("Id:      "+bal.accountId);
		System.out.println("Name:      "+bal.accountName);
		System.out.println("Balance:      "+bal.accountBal);
		
		
	}


	private void add(int i) {
		// TODO Auto-generated method stub
		
	}

}
