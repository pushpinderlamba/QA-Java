package Managestatics;

public class Test {
	
	float interest =2.0f;
	
	static float rate = 3.9f;
	
	static String sentence = "Hereby you";
	
	static void display(String msg) {
		
		System.out.println(msg);
		
	}

	
      void calculateSquare(int n) {
    	  
    	  System.out.println("Inside CalculateSquare");
    	  
    	  System.out.println(n*n); 
      }
      
      void square(int n) {
    	  
    	  System.out.println("Inside square");
    	  
    	  calculateSquare(n);
      }
}

