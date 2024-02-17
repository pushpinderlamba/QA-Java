package Managestatics;

public class Company {

	  
	  String add ;
	  
	  String name ;
	  
	  String contactno;
	  
	  
	  public Company() {
		  
		  super();
	  }
	  
	  
	  public Company(String a) {
		  
		    super();
		    this.add =a;
		    
		    
	  }
	  
	  public Company(String a,String n) {
		  
		  super();
		  
		    this.add = a;
		    
		    this.name = n;
		    
		   

	  }
	  
	  public Company(String a,String n,String ph) {
		  
		  super();
		  
		  this.add = a;
		    
		    this.name = n;
		  
		  this.contactno = ph;
		  
		 

	  }


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	  
	public static void main(String[] args) {
	    
	    Company c =  new Company();
	    
	    Company c1= new Company("St2");
	    
	    Company c2= new Company("St3", "Tina");
	    
	    Company c3= new Company("St4","Sam", "86546789");

}
}