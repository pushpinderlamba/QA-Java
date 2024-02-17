package Session8Extendingclasses;

public class B extends A{
	
	double salary=1000;
	
	void display() {
		
		System.out.println("I Belong to class B");
		
	}
	
	public static void main(String[] args) {
		
		
		B obj1 = new B();
		
		System.out.println(obj1.salary);
		
		System.out.println(obj1.count);
	
		
		obj1.print();
		
		C obj2 = new C();
		
		obj2.print();
		
		obj2.display();
		
		A a1 = new A();
		
		A a2 = new B();
		
		if(a1 instanceof B) {
			
			System.out.println("a1 is object B");
		}
		
		if(a2 instanceof B) {
			
			System.out.println("a2 is object B");
		}
	}

}
