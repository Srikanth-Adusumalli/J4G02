//ass-4--3(2)
package Module4;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookClass2 {

	public static void main(String[] args) {

		List<BookClass1> list = new LinkedList<BookClass1>();

		list.add(new BookClass1(1, "JAVA", "JAMES", 500));
		list.add(new BookClass1(2, "C#", "BINJOS", 580));
		list.add(new BookClass1(3, "PHP", "PICTOROS", 340));
		list.add(new BookClass1(4, "PYTHON", "PYTHOS", 600));
		list.add(new BookClass1(5, "GO", "GOOGLE", 800));

		Comparator<BookClass1> b = Comparator.comparing(BookClass1::getBookPrice);

		Collections.sort(list, b);
		System.out.println("Sorted by Price");

		for (BookClass1 bb : list) {

			System.out.println(bb.bookId + " " + bb.bookName + " " + bb.authorName + " " + bb.bookPrice);

		}
	}
}