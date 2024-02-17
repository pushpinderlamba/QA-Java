package method.scope;

import java.util.Scanner;

public class calculatesum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter first number");
		
		double fnum = scanner.nextDouble();
		
		System.out.println("Enter second number");
		
		double snum = scanner.nextDouble();
		
		double sum = fnum+snum;
		
		System.out.println("The sum is"  + sum);
		
		
		
	}
	
}
