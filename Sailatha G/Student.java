package Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Student {
	
	
	String Name;
	String Age;
	
	public Student(String Name,Integer Age)
	{
		this.Name = Name;
		this.Age = Age;
	}
	//Getter setter methods
	public String getName() { return Name; }
	
	public void setName(String Name) {this.Name = Name;}
	
	public Integer grtAge() { return Age; }
	
	public void setAge(Integer Age) {this.Age = Age; }
	
	@Override public String toString()
	{
		return "Customer{"
				+"Name"+Name +",Age="+Age +'}';
	}
	static class CustomerSortingComparator
	implements Comparator<Student> {
		
		public int compare(Student customer1,
				            Student customer2)
		{
			int NameCompare = customer1.getName().compareTo(
					customer2.getName());
			int AgeComapre = customer1.getAge().compareTo(
					customer2.getAge());
			return(NameCompare == 0) ? AgeCompare
					                 : NameCompare;
		}
	}
	
	public static void main(String[] args)
	{
		List<Student> a1 = new ArrayList<>();
		Student obj1 = new Student("Arjun", 23);
		Student obj2 = new Student("Rasi", 27);
		Student obj3 = new Student("Sai", 23);
		Student obj4 = new Student("Nani", 27);
		Student obj5 = new Student("Chinnu", 23);
		Student obj6 = new Student("Jana", 27);
		
		a1.add(obj1);
		a1.add(obj2);
		a1.add(obj3);
		a1.add(obj4);
		a1.add(obj5);
		a1.add(obj6);
		
		Iterator<Student> custIterator = a1.iterator();
		
		System.out.println("Before Sorting:\n");
		
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}
        
		Collections.sort(a1,
				            new CustomerSortingComparator());
		System.out.println("\n\nAfter Sorting:\n");
		for(Student customer : a1) {
			System.out.println(customer);
		}
		
	}
}

