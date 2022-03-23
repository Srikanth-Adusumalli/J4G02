package Assingment2;

public class Bookclone {
	int bookID;
	String bookName;

	public Bookclone(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void BookClone(int bookID, String bookName) {

		this.bookID = bookID;
		this.bookName = bookName;
	}

	public void displayBookInformation() {
		System.out.println(this.bookID + "," + this.bookName);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Bookclone books = new Bookclone(10, "java");
		Bookclone books1 = null;
		try {
			books1 = (Bookclone) books.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		books.displayBookInformation();
		books1.displayBookInformation();
	}

}
