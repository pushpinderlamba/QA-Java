package Practice.Session;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class SortStocksUtil {
	public static void main(String[] args) {
	    
	    List<Stocksfeb17> allStocks =  new LinkedList<>();
	    
	    allStocks.add(new Stocksfeb17("wipro", Double.valueOf(600)));
	    allStocks.add(new Stocksfeb17("tcs", Double.valueOf(3400)));
	    allStocks.add(new Stocksfeb17("infosys", Double.valueOf(1500)));
	    allStocks.add(new Stocksfeb17("techM", Double.valueOf(1900)));
	    
	    System.out.println("- - - - - -  - Before calling sort:" );
	    
	    displayStocks(allStocks);
	    
	    Collections.sort(allStocks);
	    
	    System.out.println("- - - - - - - After calling sort:" );
	    
	    displayStocks(allStocks);

	}

	static void displayStocks(List<Stocksfeb17> lis) {
	    
	    for (Stocksfeb17 st: lis) {
	        System.out.println(st);
	    }
	}
	}

