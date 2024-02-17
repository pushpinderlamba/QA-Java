package Sessionsix.loops;

import java.util.Scanner;

public class SwitchExamplesString {

	public static void main(String[] args) {
		
		
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a path to website:");
	    String path = sc.nextLine();
	    
	  //  switch(path) {
	    
	  //  case "/":
	    //    System.out.println("Application root path.");
	    //    break;
	   // case "/test":
	    //    System.out.println("www.demourl.com/test");
	    //    break;
	  //  case "/list":
	   //     System.out.println("@ /list path");
	     //   break;
	  //  default:
	      //  System.out.println("Enter a valid path value.");
	       // break;
		
		
		if (path.equals("/")) {
			
			System.out.println("Application root path.");
			
		}
			else if (path.equals("/test")) {
				
				System.out.println("www.demourl.com/test");
				
			}
				
				else if (path.equals("/list")) {
					 
					System.out.println("@ /list path");
					
			
				}
		
				else if (path.equals("/home")) {
					
					System.out.println("@ /home path");
					
				}
					
				else if (path.equals("/users")) {
					
					System.out.println("@ /user path");
					
				}
		
					else {
						
						System.out.println("Enter a valid path value.");
					
				}
				
				
				
			
	    
	    }

	}


