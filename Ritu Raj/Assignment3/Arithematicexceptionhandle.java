package Assgnment3;

public class Arithematicexceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int value1 = 30, value2 = 20, value3 = 0;

				int value4 = value1 / value2;
				try {
					int value5 = value1 / value3;
				} catch (ArithmeticException ex) {
					System.out.println("not divide by zero");
				}
				System.out.println(value4);

			}

	}


