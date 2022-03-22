
public class BookEqualOp {
	int bookId;
	String bookName;

	

	public BookEqualOp(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	

	public boolean shoaib(Object o) {
		BookEqualOp e = (BookEqualOp) o;
		if (this.bookId == e.bookId && this.bookName.equals(e.bookName))
			return true;
		else {
		return false;
		}
	}
/*
 * public static void main(String[] args) { BookEqualOp obj=new BookEqualOp(1,
 * "en");
 * 
 * System.out.println(obj.shoaib(obj)); } }
 */
	public static void main(String args[]) {
		BookEqualOp e1 = new BookEqualOp(11, "math");
		BookEqualOp e2 = new BookEqualOp(12, "math");

		if (e1.equals(e2)) {
			System.out.println("Object are equal");
		} else {
			System.out.println("objects are not equal");
		}
	}

}