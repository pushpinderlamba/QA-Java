package Managestatics;

public class Item {
	
	
  int id;
  
  String name ;
  
  Long modelno;
  
  
  public Item() {
	  
	  System.out.println("Inside default constructor");
  }
  
  
  public Item(int id_d) {
	  
	  
	    this.id = id_d;
	    
  }
  
  public Item(int id_d, String tname) {
	  
	    this.id = id_d;
	    
	    this.name = tname;;
  }
  
  public Item( int id_d, String tname ,long model_n) {
	  
	  
	  this.id = id_d;
	  
	  this. name = tname;
	  
	  this.modelno = model_n;
  }

 

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Long getModelno() {
	return modelno;
}


public void setModelno(Long modelno) {
	this.modelno = modelno;
}


public static void main(String[] args) {
	   
	 // Item t1 = new Item();
	  
	  Item t2 = new Item(2);
	 
	 Item t3 = new Item(3, "item 3");
	 
	 Item t4 = new Item(4, "item 4", 14654625);

	 Item t5 = new Item (0000455);
	 
	 t5. setModelno(1237855);
	  
  }
}
