package Sessionseven.method;

public class StringMethod {

	public static void main(String[] args) {
		
		String str= "Write on console";
		
		String output;
		
		StringMethod obj = new StringMethod();
		
		output = obj.getReversed(str);
		
		System.out.println(output);// printing in other method called//
		
		System.out.println("__________________________");//printing in other method called//
		
		System.out.println(obj.reverseBuilder( "Tina"));//printing in other method called//

	}

	
	String getReversed(String input) {
		
		String revstr="";
		
		int n = input.length()-1;
		
		for(int i=n;i>=0;i--) {
			
			revstr = revstr+ input.charAt(i);
			
			//System.out.println(revstr);// printing in other method called//
			
		}
		 return revstr;//printing in other method called//
		}
	
	//String reverseBuilder(String token) {
		
		//StringBuffer sb = new StringBuffer(token);
		
		//return sb.reverse().toString();
	}
	

