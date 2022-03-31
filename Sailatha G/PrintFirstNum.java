//ass5-que9;
package assinment5;
import java.util.ArrayList;
import java.util.List;

public class PrintFirstNum {
	

		public static void main(String[] args) {
			List<Integer> number = new ArrayList<Integer>();
			number.add(8);
			number.add(15);
			number.add(18);
			number.add(67);
			number.add(7);
			number.add(98);
			number.add(34);
			number.add(25);
			number.add(77);
			number.add(81);
			
			int firstNumber =number.stream().filter(n->n>20).findFirst().get();
			System.out.println(firstNumber);

}
}