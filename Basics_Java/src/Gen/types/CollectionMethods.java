package Gen.types;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CollectionMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System .out.println ("Enter the number of books");
		int nob = sc.nextInt();
		String nm= "";
		String isbn= "";
		
		List<Book> books=new ArrayList<Book>();
		
		for(int i=0;i<nob;i++) {
			System.out.println("Enter  book name;");
			
			nm=sc.next();
			
		
		System.out.println("Enter  book ISBN;");
		
		isbn=sc.next();
		
		Book b = new Book(nm,isbn);
		books.add(b);
	}

}

}