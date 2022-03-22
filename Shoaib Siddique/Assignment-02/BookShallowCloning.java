
public class BookShallowCloning {

	int bookId;
	String bookName;

	public BookShallowCloning (int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return bookId + bookName;
	}

	public static void main(String args[]) {
		BookShallowCloning  book = new BookShallowCloning (22, "computer science");
		BookShallowCloning  book1 = null;
		try {
			book1 = (BookShallowCloning ) book.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(book);
		System.out.println(book1);
	}

}