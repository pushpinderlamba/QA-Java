package Sessionsix.loops;

import java.util.Scanner;

public class Cases {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the path you want to find");
	    String path=sc.nextLine();
	    
	    switch(path) {
	    case "/": 
	        System.out.println("Application root path");
	        break;
	    case "/test":
	        System.out.println("www.demourl.com/test");
	        break;
	    case"/list":
	        System.out.println("www.demourl.com/listpath");
	        break;
	    case "/home":
	        System.out.println("www.demourl.com/home");
	        break;
	    case "/users":
	        System.out.println("www.demourl.com/users");
	        break;
	    default:
	            System.out.println("Enter a valid root path");
	    }
	}
		

	}


