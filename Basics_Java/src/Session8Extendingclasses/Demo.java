package Session8Extendingclasses;

public class Demo {
	
	public static void main(String[] args) {
		//polymorphism//
		
		MountainBicycle mb = new MountainBicycle("Hero", 4, 10);
	    
	    mb.stopMountainBicycle();
	    
	    Bicycle b;
	    
	    b = new MountainBicycle("Atlas", 3, 5);
	    
	    System.out.println(b.getBrand());
	    System.out.println(b.getGears());
	    
	    b.applyBrakes();
	    
	   // Bicycle bo = new Bicycle(3, "Atlas");
	    
	    
	    Base base= new Derived();
	    base.displayInfo();
	    
	    Base b03 = new Base();
	    b03.displayInfo();
	//X MountainBicycles mb001 = new Bicycle();
	    
	    
	    //Default modifiers//
	    
	    Base b1 = new Base();
	    
	     System.out.println(b1.getY());
	    
	     System.out.println(b1.getX());

	}

}
