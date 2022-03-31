package Assignment4;

public class Comparable implements Comparable<Comparable1> {
	int rollno;
	String name;
	int age;

	Comparable1(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}

	public int compareTo(Comparable1 ct) {
		if (age == ct.age)
			return 0;
		else if (age > ct.age)
			return 1;
		else
			return -1;
	}
}
