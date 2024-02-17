package Sessionseven.method;

import java.util.Scanner;

public class OddevenMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int num=sc.nextInt();
	    
	    OddevenMethod f=new OddevenMethod();
	    
	    boolean b=f.checkOddeven(num);
	    		
	    if(b) {
	    	
	    	System.out.println("You entered even number");
	    }
	    
	    else {
	    	
	    	System.out.println("You entered odd number");
	    }
        
	}
       
	boolean checkOddeven(int n) {
		
	if(n%2==0) {
		
		return true;
	}
	
	else {
		return false;
	}
	}
}
	
	

