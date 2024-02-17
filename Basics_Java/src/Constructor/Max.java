package Constructor;

public class Max {
	
	public static void main(String[] args) {
	
	Max obj = new Max();
	
	System.out.println(obj.maximum(22,34.5));
    
    System.out.println(obj.maximum(23,87));
    
    System.out.println(obj.maximum(33.5,87));
    
}
    

double maximum(int x,double y) {
	
	if (x > y)
        return x;
    else
        return y;
}

double maximum(int x, int y) {
    if (x > y)
        return x;
    else
        return y;
}

double maximum(double x, double y) {
    if (x > y)
        return x;
    else
        return y;
    
}
}