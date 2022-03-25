
public class BookArray {
	int bookId;
	String bookName;
	public BookArray(int bookId,String bookName) {
		super();
		this.bookId =bookId;
		this.bookName =bookName;
		}
	public void display() {
		System.out.println("bookid:"+" "+bookId+" "+"bookName:"+" "+bookName);
	}

	public static void main(String[] args) {
		BookArray[] bk=new BookArray[5];
		bk[0] =new BookArray(1,"kanada");
		bk[1] =new BookArray(2, "English");
		bk[2] =new BookArray(3, "Telugu");
		bk[3] =new BookArray(4, "Hindi");
		bk[4] =new BookArray(5, "Tamil");
		 for(BookArray ba:bk) {
			 ba.display();
		 }

	}

}
