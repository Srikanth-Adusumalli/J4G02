//Assignment:3(2)-Handle more than one try block Exceptions.
package Assignment4;

public class trycatch {

	public static void main(String args[]) {
		try {
			int a[] = new int[10];

			a[11] = 9;
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceeption");
		} catch (ArrayStoreException e) {
			System.out.println("ArrayStoreBoundException");
		} finally {
			System.out.println("END");
		}
	}

}
