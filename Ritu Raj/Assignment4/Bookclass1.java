package Assignment4;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Bookclass1 {

	public static void main(String[] args) {
		List<BookClass1>list = new LinkedList<BookClass1>();
		list.add(new Bookclass(1,"java","james",550));
		list.add(new BookClass1(110,"javascript","satya",450));
		list.add(new BookClass1(15,"python","pichai",600));
		list.add(new BookClass1(14,"php","stfen",170));
		list.add(new BookClass1(121,"angular","john",200));
		
		//sorting by the price of book
		
		Comparator<BookClass1> b1 = Comparator.comparing(BookClass1::getBookPrice);
		
		Collections.sort(list,b1);
		System.out.println("Sorted By Price");
		for(BookClass1 b :list) {
			System.out.println(b.bookId+" "+b.bookName+" "+b.authorName+" "+b.bookPrice);
		}
	}

}
