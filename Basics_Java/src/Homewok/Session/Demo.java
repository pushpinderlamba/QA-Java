package Homewok.Session;
import java.util.Scanner;
public class Demo {
	  
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the width");
	    int w = sc.nextInt();
	    
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the height");
	    int h = sc1.nextInt();
		
		
		Rectangle rectangle = new Rectangle(w, h);
			
			rectangle.printSize();
		  
			rectangle.resizeWidth(h);
	        rectangle.resizeHeight(w);
	        
	        rectangle.printSize();
		 
		   
        
	}

}
