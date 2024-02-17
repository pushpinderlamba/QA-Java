package Practice.Session;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		

		Map<Integer, String>Beverage  =  new HashMap<>();
		
		Beverage.put(121, "COKE");
		Beverage.put(212, "FANTA");
		Beverage.put(103, "PEPSI");
		Beverage.put(105, "SPIRITE");
		Beverage.put(110, "DR PEPPER");
		
		System.out.println("Before calling delete:"+ Beverage);
	    
		String value =  "PEPSI";
	    Beverage = delete(Beverage,value);
	    System.out.println("After calling delete" +Beverage);
	    
	   
	}
     
	static Map<Integer, String> delete(Map<Integer, String> bv, String valueTo) {
	    	
	    	 Iterator<Entry<Integer, String>> iterator  = bv.entrySet().iterator();
	    	    
	    	    while(iterator.hasNext()) {
	    	        
	    	        if(valueTo.equals(iterator.next().getValue())) {
	    	            
	    	            iterator.remove();
	    	        }
	    	    }
	    	    
	    	    return bv;
}
}
