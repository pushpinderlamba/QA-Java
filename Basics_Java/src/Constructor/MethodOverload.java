package Constructor;

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		System.out.println(obj.sum(1, 2));
		System.out.println(obj.sum(1,2.1));
	    System.out.println(obj.sum(1,2,3));

	}
     double sum(int x,double y) {
    	 
    	 return x+y;
     }
     
     double sum(int x, int y) {
    	 
    	 return x+y;
     }
     
     double sum(int x,int y,int z) {
    	 
    	 return x+y+z;
    	 
     }
}
