//Q-5(2): Shallow cloning
package Assignment3;

public class shallow2 {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		shallow e = new shallow(vals);
		e.showData();
		vals[0] = 13;
		e.showData();
	}
}
