package welcome.java;

public class Calculator {
static	void sum(float a ,float b) {
		System.out.println("Sum of two nos....>"+a+b);
	}
static	void subtraction(float c , float d) {
		System.out.println("Subtraction of two nos.....>" + c + d);
	}
static	void multiplication(int f , int g) {
		System.out.println("Multiplication of two nos..."+f+g);
	}
	static void division(float h , float i ) {
		System.out.println("Division of two nos....>" +h/i);
		
	}
	static void average(float t , float r) {
		System.out.println("Average of two nos....>"+(t+r)/2);
	}
	public static void main(String...args) {
		sum(11,22);
		subtraction(33,44);
		multiplication(66,7);
		division(66,3);
		average(55,33);
		
	}

}
