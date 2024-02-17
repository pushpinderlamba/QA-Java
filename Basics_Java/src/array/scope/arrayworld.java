package array.scope;

public class arrayworld {

	public static void main(String[] args) {
		
    String[] names ={"David","Ayesha","Bushra","Test"};

	String[] duplicates;
	duplicates = names;
	
	duplicates[0]= "Peter";
	
	System.out.println(names[0]);
	
	}

}
