package Demo.Except;

public class FileReading {

	public static void main(String[] args) {
		
	
		    
		    String s1  = "347";
		    
		    String s2 = "448";
		    
		    Integer i1 = Integer.parseInt(s1);
		    
		    System.out.println("i1=" + i1);
		    
		    Integer i2 =0;
		    
		    try {
		        
		       i2  = Integer.parseInt(s2);
		        
		    }catch(NumberFormatException ab) {
		        System.out.println("Number format exception caught.");
		        //ab.printStackTrace();
		    }
		    
		    
		    
		    System.out.println("i2=" + i2);
		    
	}

}
