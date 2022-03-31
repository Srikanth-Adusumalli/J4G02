package Assingment5;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
public class ListofInteger {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(3, 12, 27, 18, 24, 48, 12, 3);

		int integer = 20;
		int value = ((Object) stream()).peek(num -> System.out.println("will filter " + num)).filter(x -> x > 20).findFirst().get();
				
		System.out.println(value);

	}

	private static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
}
