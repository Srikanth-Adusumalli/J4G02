package Assignment4;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class BookObjects {
	
	
	public static void main(String []args) {


		List<BookObject1>list = new LinkedList<BookObject1>();
		
		list.add(new BookObject1(1,"java","james",550));
		list.add(new BookObject1(110,"javascript","satya",450));
		list.add(new BookObject1(15,"python","pichai",600));
		list.add(new BookObject1(14,"php","stfen",170));
		list.add(new BookObject1(121,"angular","john",200));
		
		//sorting by the price of book
		
		Comparator<BookObject1> b1 = Comparator.comparing(BookObject1::getBookPrice);
		
		Collections.sort(list,b1);
		System.out.println("Sorted By Price");
		for(BookObject1 b :list) {
			System.out.println(b.bookId+" "+b.bookName+" "+b.authorName+" "+b.bookPrice);
		}
	}
}

	


