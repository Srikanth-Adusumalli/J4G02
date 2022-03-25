
public class Average {

	public static void main(String[] args) {
		int[] numbers = new int[] {40,26,38,50,27};
		int sum = 0;
		for(int i=0;i<numbers.length;i++)
			sum = sum + numbers[1];
		double average = sum /numbers.length;
		System.out.println("Average value of the array elements is :"+ average);

	}

}
