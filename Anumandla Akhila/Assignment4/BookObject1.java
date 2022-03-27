package Assignment4;

public class BookObject1 {
	

		int bookId;
		String bookName;
		String authorName;
		double bookPrice;
		
		public BookObject1(int bookId, String bookName, String authorName, double bookPrice) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.authorName = authorName;
			this.bookPrice = bookPrice;
		}	
		
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}
	}


