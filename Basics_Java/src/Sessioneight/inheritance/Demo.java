package Sessioneight.inheritance;

public class Demo {

	public static void main(String[] args) {
		
  //  Employees e = new HRManager();
  //   e.work();
     
  //   e.getSalary();
     
 //    HRManager H = new HRManager ();
     
     
  //     H.addEmployee();
       
       
         BankAccount B = new SavingsAccount("B", 100);
    	 
    	 B.deposit(500);
     
         B.withdraw(100);
       
         SavingsAccount S = new  SavingsAccount("S",100);
         
         S.withdraw(400);
   
	
	Athlete A =  new Athlete();
	
	LazyPerson L = new LazyPerson();
	
	A.eat();
	
	A.exercise();
	
	
	L.eat();
	
	L.exercise();
	
	}
	

}
