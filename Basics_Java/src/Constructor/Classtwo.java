package Constructor;

public class Classtwo {

	int x;
	int y;

	public Classtwo(){

	    super();
	  
	    System.out.println("default constructor");
	}

	public Classtwo(int x) {
	    
	    this();
	    
	    this.x = x;

	    System.out.println("Received:" +x);
	    
	}

	public Classtwo(int x, int y) {
		
		this(x);
	    this.x = x;
	    this.y = y;
	    
	    System.out.println("x+y="+( x+y));
}
}