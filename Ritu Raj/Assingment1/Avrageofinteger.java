package Printname;

public class Avrageofinteger {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("sum of elements of array=" + sum);

		int b = sum / a.length;
		System.out.println("average of array=" + b);

}
}