package method.scope;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		// Scanner class is used for collecting input information from the user.
		// It acts like a bridge b/w user and the program

		    
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("What is your name?");
		    
		    String name = scanner.nextLine();
		    
		// System.out.println("My name is " + name);

		    System.out.println("What is your age?");
		    
		    int age = scanner.nextInt();
		    
		    System.out.println("What is your Gender?");
		    
		    String gender = scanner.next();

		    System.out.println("Where are you from?");
		    
		    String location =  scanner.next();
		    
		    System.out.println("Where do you live?");
		     
		    String currentlocation = scanner.nextLine();
		    
		    System.out.println("Where do you work?");
		    
		    String work  = scanner.next();
		    
		    System.out.println("What is your job role?");
		    
		    String job = scanner.nextLine();
		    
		    System.out.println("What is your salary?");
		   
			double salary = scanner.nextDouble();
			
			System.out.println("How much raise are you getting next year?");
			
			double raise = scanner .nextDouble();
			
			double netincome = salary + raise;
			
			System.out.println("My name is " + name + ".I am " + age + " years old," + gender + ". I am from "
		            
                    + location + ". I live currently in " + currentlocation + ". I am working in "+ work
                    + ". I am making " + salary + " dollar an year"
                    + ". I will get " + raise + " as raise so my salary would be "+ netincome + " dollar next year");
    
			
			
			
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
