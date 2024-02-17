package Constructor;

public class MethodOverload1 {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();

	    double result =obj.sum(1, 9.8);
	    
	    System.out.println(result);
	}

	double sum(int x, double y) {
	    
	    System.out.println("x,y");
	    
	    //int p=(int)y;//truncated value
	    //double add = sum(x,p)//
	   //return add;//		
	    return sum(x, (int)y);
	}


	double sum(int x, int y) {
	    
	    System.out.println("second");
	    return sum(x, y, x+y);
	}

	double sum(int x, int y, int z) {
	    System.out.println("third");
	    return x+y+z;

	}

}
