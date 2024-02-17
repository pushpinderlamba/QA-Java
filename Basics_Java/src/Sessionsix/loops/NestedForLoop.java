package Sessionsix.loops;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a path to website:");
	    String path = sc.nextLine();
	    int id = 2;
	    // nested switch case
	    if(path.equals("/list")){
	    	System.out.println("Enter the id to fetch :");
	    	id = sc.nextInt();
	    }
	    
	    switch(path) {
	    
	    case "/":
	        System.out.println("Application root path.");
	        break;
	    case "/test":
	        System.out.println("www.demourl.com/test");
	        break;
	    case "/list":
	        System.out.println("@ /list path");
	        switch(id) {
	        case 1:
	            System.out.println("ID 1");
	            break;
	        case 2:
	            System.out.println("ID 2");
	            break;
	        case 3:
	        case 4:
	        default:
	            System.out.println("Only top 4 were listed.");
	            break;
	        }
	        break;
	    
	    default:
	        System.out.println("Enter a valid path value.");
	        break;

	}
	    
	}
}


