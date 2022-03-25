
public class BookArray {
	int bookId;
	String bookName;
	
	   public BookArray(int bookId,String bookName) {
		   super();
		   this.bookId=bookId;
		   this.bookName=bookName;
	   } 
	   
	   public void display() {
		   System.out.println("bookId :"+" "+bookId+" "+"bookName :"+" "+bookName);
	   }

	public static void main(String[] args) {
		
		BookArray[] BA=new BookArray[5];
		BA[0]=new BookArray(1,"java");
		BA[1]=new BookArray(2,"c");
		BA[2]=new BookArray(3,"c++");
		BA[3]=new BookArray(4,".net");
		BA[4]=new BookArray(5,"corejava");
		for(BookArray book:BA);
		book.display();
	}

}
