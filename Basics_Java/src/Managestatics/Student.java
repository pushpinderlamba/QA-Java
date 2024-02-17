package Managestatics;

public class Student {
	
	int rollno;
	
	String name;
	
	public Student(int roll_n, String studentname) {
		
		System.out.println("Hello from 2 parameter constructor.");
		
		this.rollno = roll_n;
		this.name = studentname;
	}
	
	
	public Student() {
		
		System.out.println("Default constructor.");
	}

	
	public Student(int roll_n) {
		
		System.out.println("Single argument constructor.");
		
		this.rollno = roll_n;
	}
	
	public void setFields(String name, int roll) {
	    
	    this.rollno =roll;
	    
	    this.name = name;
	}
		
		

	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		
		Student std2 = new Student(10);
		
		new Student(21);
		
		Student s3 = new Student(1,"Tina");
		
		s3. setFields("suresh",10);
		
		System.out.println(s3.name+"," + s3.rollno);
	}
	}

