package loops.scope;

import java.util.Arrays;
import java.util.Collections;

public class Conditions3 {

	public static void main(String[] args) {
		
		//Apart from For loop, we also have while and do-while loops
	    // which can be used in Java
	    
	    //We have for-each loop for non-primitives
	    
	    String[] ages = {"11", "22", "33", "17" ,"19"};
	    
	    //A For-Each loop example


	    for(String temp:ages) {
	        
	        System.out.println(temp.concat(" number as strings."));
	    }
	    
	    //Arrays.sort()
	    
	    int[] sorted = {34, 23, 77, 56, 4, 3, 5, 90, 110, -1};
	    
	    Arrays.sort(sorted);
	    
	    System.out.println(Arrays.toString(sorted));
	    
	    Arrays.sort(ages, Collections.reverseOrder());
	    
	    System.out.println(Arrays.toString(ages));
	    
	    String[] countries = {"USA", "FRANCE", "ENGLAND", "BHUTAN", "SWITZERLAND"};
	    
	    Arrays.sort(countries);
	    
	    System.out.println(Arrays.toString(countries));
	    
	    Arrays.sort(countries, Collections.reverseOrder());
	    
	    System.out.println(Arrays.toString(countries));
	    
	   
	    
	    
	
	

		
	}

}
