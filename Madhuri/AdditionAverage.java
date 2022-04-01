package AdditionAverage;
public class AdditionAverage {
	int[] data = { 2,3,4,5,6 };
	public static int findSumWithoutUsingStream(int[] data) {
	    int sum = 0;
	    for (int value : data) {
	        sum += value;
	    }
	    return sum;

	}
}
