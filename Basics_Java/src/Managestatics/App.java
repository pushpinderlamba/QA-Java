package Managestatics;

public class App {
	
	public static void main(String[] args) {
		// calling static from static if it belongs to different class otherwise only method name if same class //
		Test.display("hi");
		
		System.out.println(Test.rate);
		
	// calling non static from non static need to create object if not in same class otherwise only method name if same class//
		Test test = new Test();
		
		System.out.println(test.interest);
		
		Test.display("Calling static method on objects");
		
		// calling non static from static we need to create object even if in same class or different class//
		
		Test t1 = new Test();
		
		Test t2 = new Test();
		
		t1.rate = 5.8f;
		
		System.out.println(t2.rate);
		
		t1.interest = 7.5f;
		
		System.out.println(t2.interest);
		
		test.calculateSquare(9);
		
	}

}

