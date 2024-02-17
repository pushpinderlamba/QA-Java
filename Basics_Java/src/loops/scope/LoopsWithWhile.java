package loops.scope;

import java.util.Scanner;

public class LoopsWithWhile {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a String:");
	    
	    String s1=sc.nextLine();
	    
	    int len= s1.length();
	    
	    System.out.println(len);
	    
	    String s2 = s1.toUpperCase();
	    
	    int k=0;
	    
	    while(k<len) {
	    	
	    	 System.out.print(s2.charAt(k)+ " ");
	    	 
	    	 k=k+1;
	    	  if(k==25)
	    		  
	    		  break;
	    	 
	    	 
	    }
	    
	}

}
