package Testaccess;

public  class Horse extends Animal {

	@Override
	String makesSound() {
		
		String sound = "Horse makes horse sound";
		System.out.println( "Horse makes horse sound");
		
		return sound;
		
	}
	void speedup() {
	
	System.out.println( "Horse speeds are very high");


}
}
