package Gen.types;
import java.util.Objects;
public class SortingBook {

    String name;
	
    String isbnno  ;
    
    public SortingBook() {
    	super();	
    }
    public SortingBook(String name,String isbnno) {
    	super();
    	this.name = name;
    	this.isbnno= isbnno;
    
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbnno() {
		return isbnno;
	}
	@Override
	public int hashCode() {
	    return Objects.hash(name, isbnno);
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Book other = (Book) obj;
	    return Objects.equals(name, other.name) && Objects.equals(isbnno, other.isbnno);
	}
	public void setIsbnno(String isbnno) {
		this.isbnno = isbnno;
	}
	@Override
	public String toString() {
		return "Book [name="+ name+ " ,  isbnno  =" +isbnno+"]";
	}

}

