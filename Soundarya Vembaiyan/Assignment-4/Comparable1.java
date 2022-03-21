//ass-4--5(1)
package Module4;

public class Comparable1 implements Comparable<Comparable1> {
	int rno;
	String name;
	int age;

	public Comparable1(int rno, String name, int age) {
		this.rno = rno;
		this.name = name;
		this.age = age;
	}

	public int CompareTo(Comparable1 c) {
		if (age == c.age)
			return 0;
		else if (age > c.age)
			return 1;
		else
			return 1;
	}

	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
