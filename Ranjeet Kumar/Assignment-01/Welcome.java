package welcome.java;

public class Welcome {
	
	static String country_name="India";  
		String player_name;
		int age;
		int player_id_no;
		Welcome(String player_name ,int age ,int player_id_no){
			this.player_name=player_name;
			this.age=age;
			this.player_id_no=player_id_no;
		}
		void display() {
			System.out.println("Country of player...>" + " " +country_name+ "  "+  "PlayeName...>"+ "  " +player_name+ "  "+ "Cricket Player Age---->"+ "  " +age+"  "+"Cricket Player id no...>"+"  "+player_id_no);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ranjeet");
		Welcome o1=new Welcome("Virat kohali",30,55);
		Welcome o2=new Welcome("Rohit Sharma",32,66);
		Welcome o3=new Welcome("Ambatiraidu",31,70);
		Welcome o4=new Welcome("Yuraj singh",33,88);
		Welcome o5=new Welcome("MS Dhoni",37,22);
		o1.display();
		o2.display();
		o3.display();
		o4.display();
		o5.display();
		
		

	}

}
