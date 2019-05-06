package Package1;
public class Book {
	String book_name;
	float book_price;
	String book_author;
	
	public Book(String bn, float bp, String ba)
	{
		book_name = bn;
		book_price = bp;
		book_author = ba;
	}
	
	public void getDetails()
	{
		System.out.println(book_name+" "+book_price+" "+book_author);
	}
	
	
}
