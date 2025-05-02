package week1.day2;

public class Library {
	public String addBook(String bookTitle)
	{
		
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");	
	}
	public static void main(String[] args)
	{
		Library lib=new Library();
		System.out.println(lib.addBook("Book added successfully"));
		lib.issueBook();
	}
	

}
