//ass5-que5
package assinment5;
import java.util.ArrayList;
import java.util.function.Predicate;


public class PrintArrayListByPredicate {


		public static void main(String[] args) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			for(int i=1;i<=10;i++)	
				numberList.add(i);
			Predicate<Integer> oddNumbers = n->n%2!=0;
			System.out.println("Printing Odd Numbers from 1 to 10");
			for(Integer number : numberList)
				if(oddNumbers.test(number))
					System.out.print(number+" ");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
