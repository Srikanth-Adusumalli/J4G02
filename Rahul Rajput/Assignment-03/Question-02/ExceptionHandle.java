package com.Assignment3;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
			int a[] = { 1, 2, 3, 4, 5 };
			a[5] = 30 / 30;
			System.out.println(a[0]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurs");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		System.out.println("Run");
	}
}
