package Sessioneight.inheritance;

public class HRManager extends Employees{



	@Override
	public void work() {
	    System.out.println("Over riding work method from HRManager class");
	}

	public void addEmployee() {

	    System.out.println("addEmployee method from HRManager class");
	}
}



