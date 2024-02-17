package Sessionsix.loops;

import java.util.Scanner;

public class WeeksExample {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day:");
		
		int Day = sc.nextInt();
		
	    switch(Day) {
	    
	    case 1:
	        System.out.println("Mondays are fun."); 
	        break;
	    case 2:
	        System.out.println("Tuesdays are tiring.");
	        break;
	    case 3:
	        System.out.println("Wednesdays are fulfilling.");
	        break;
	    case 4:
	    	 System.out.println("Thursdays are normal.");
	    	 
	    case 5:
	    	System.out.println("Friday is TGIF.");
	    case 6:
	    case 7:
	        System.out.println("Aha! It's the weekend finally.");
	        break;
	    default:
	        System.out.println("Not a valid day.");
	        break;
	    
	    }

	}

}
