package loops.scope;

import java.util.Scanner;

public class Condition2 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int a = sc.nextInt();
		
		int i;
	    
		for(i=1;i<=a;i++) {
			
		
		if(i%2==0) {
			
			System.out.println(i);
		}
		
	}
	}

}
