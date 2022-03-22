public class Book 
{
	private String Name;
	private int Id;
	private String Author;

	public Book() 
	{
		Name = "Java Volume1";
		Id = 101;
		Author = " Cay S. Horstmann";

	}

	public Book(String name, int isbn, String author)
	{
		Name = name;
		Id = isbn;
		Author = author;

	}

	public void setName(String Name)
	{
		this.Name = Name;
	}

	public String getName()
	{
		return Name;
	}

	public void setISBN(int ISBN)
	{
		this.Id = ISBN;
	}

	public int getISBN() 
	{
		return Id;
	}

	public void setAuthor(String Author) 
	{
		this.Author = Author;
	}

	public String getAuthor() 
	{
		return Author;
	}

	public void getBookInfo() 
	{
		System.out.printf("%s %s %s %s", Id, Name, Author);
	}

	public void showData() {
		// TODO Auto-generated method stub
		
	}

}