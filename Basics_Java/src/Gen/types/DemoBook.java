package Gen.types;

import java.util.Set;
import java.util.HashSet;
public class DemoBook {

	public static void main(String[] args) {
		
		    Book b1=new Book("B1","345");
		    Book b2=new Book("B1","5679");
		    Book b3=new Book("B3","2345679");
		    Book b4=new Book("B4","7876");
		    
		    Set <Book> b=new HashSet<>();
		    
		    b.add(b1);
		    b.add(b2);
		    b.add(b3);
		    b.add(b4);
		    
		    System.out.println(b);
	}

}
