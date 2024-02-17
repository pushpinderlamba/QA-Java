package Properties.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapsDemo {
	
	public static void main(String[] args) {


		//Each key-value pair is called an entry in the map.
	    
//	    Map<Integer, String> employees =  new HashMap<>();
	    
	    Map<Integer, String> employees =  new TreeMap<>();
	    
	    employees.put(121, "Ramesh");
	    employees.put(212, "Naresh");

	    employees.put(103, "Purva");
	    employees.put(104, "Apurva");
	    employees.put(105, "Apurva");
	    employees.put(110, "Prerna");
	    
	    Set<Integer> keys = employees.keySet();
	    
	    for(Integer key : keys) {
	        System.out.println(key + "---"+employees.get(key));
}
}
}
