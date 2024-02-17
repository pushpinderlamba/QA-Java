package arraystring.scope;

public class arraystring {

	public static void main(String[] args) {
		String[] cars = {"Honda", "Hyundai", "Maruti", "BMW Motors"};
	    
	    String[] Cars = new String[10];
	    
	    Cars[0] = "Mahindra";
	    
	    Cars[1] ="Nissan";
	    
	    System.out.println(cars.length);
	    
	    System.out.println(cars[1]);
	    
	    System.out.println(cars[3]);
	    
	    
	    System.out.println(Cars[5]);
	    
	    Cars[5] = "Maruti Swift";
	    
	    System.out.println(Cars[5]);
	    
	    
	    
	    String[] colours = {"Red","Blue","Yellow","Pink","Orange"};
	    
	    String[] Colours = new String[7];
	    
	    Colours[0] = "Red";
	    Colours[1] = "Yellow";
	    
	    System.out.println(colours.length);
	    
        System.out.println(Colours[0]);
	    
	    System.out.println(Colours[1]);
	    
	    System.out.println(Colours[5]);
	    
	}

}
