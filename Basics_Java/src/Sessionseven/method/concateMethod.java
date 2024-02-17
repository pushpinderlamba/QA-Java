package Sessionseven.method;

import java.util.Scanner;

public class concateMethod {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Please enter first string");
	    
	    String s1= sc.nextLine();
	    
	    System.out.println("Please enter second string");
	    
	    String s2= sc.nextLine();
	    
	    concateMethod cs=new concateMethod();
	    
	    String newStr=cs.concatStr(s1, s2);
	    
	    System.out.println("Concatenated string is: "+newStr);
	    

	}
	
	 String concatStr(String n1 ,String n2) {
		 
		 String c= n1+n2;
		 
		 System.out.println("Length of new string is: " + c.length());
		 
		 return c;
		 
		 
		 
	
	}

}
