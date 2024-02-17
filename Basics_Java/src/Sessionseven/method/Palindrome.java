package Sessionseven.method;


public class Palindrome {

	public static void main(String[] args) {
		 
		

	    System.out.println(isPalindrome("civic"));
	    System.out.println(isPalindrome("civics"));
	    System.out.println(isPalindrome("radar"));
	    System.out.println(isPalindrome("noon"));

	    
	}
	
	
	
	 static boolean isPalindrome(String in) {
		 
		 StringMethod obj = new StringMethod();
		 
		 String rev = obj.getReversed(in);
		 
		 if(rev.equals(in)) {
			 
			 return true;
			 
		 }
		 
		 else {
			   
			 return false;
		 }
	 }
}
	


