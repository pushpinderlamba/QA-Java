package Sessioneight.inheritance;

public class LazyPerson extends Person {
	@Override
	void eat() {
		
		System.out.println("Lazy person eat unhealthy");
	}
	@Override
	void exercise() {
		
		System.out.println("Lazy person does notexercise good");
	
	}
}


