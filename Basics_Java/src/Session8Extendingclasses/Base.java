package Session8Extendingclasses;



//Four access modifiers in java:default,public,private and protected,default value will be use in same package.private is not visible from anywhere outside the class
//Protected modifier means default +child class//protected in base class will be reusable in child class//
public class Base {
	
	//void displayInfo() {
		
		//System.out.println("Base Class");
	
	
	
	private int x =1;

	int y =2;

	protected int z =3;

	public int p= 4;


	void displayInfo() {
	    
	    System.out.println("Base class");

	}

	//protected access modifier means default+ child classes

	protected int getX() {        
	    return x;
	}

	 protected int getY() {
	    return y;
	
	

	
	}

}
