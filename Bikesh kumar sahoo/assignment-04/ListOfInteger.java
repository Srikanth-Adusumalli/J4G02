package threadbasics;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;

public class ListOfInteger {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(5, 15, 25, 20, 26, 47, 13, 4, 2, 10);

		int integer = 20;
		int value = stream().peek(num -> System.out.println("will filter " + num))
				.filter(x -> x > 20).findFirst().get();
		System.out.println(value);

	}

	private static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}

}
