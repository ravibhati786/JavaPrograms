import Package1.Book;

/* Write the Java program to create a package Package1 which contains class Book having details 
 * Book Name, Price and Author name and import the created package using import package where we 
 * can create the objects of class in this package and display details of those objects.
 */

public class Program14Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("CPP",2000,"Balaguruswamy");
		b.getDetails();
	}

}
