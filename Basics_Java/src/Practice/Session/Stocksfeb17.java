package Practice.Session;

public class Stocksfeb17 implements Comparable<Stocksfeb17> {
	
	private String stockname;

	private Double lastTradingPrice;


	public Stocksfeb17 () {
	    
	}

	public Stocksfeb17 (String stockname, Double lastTradingPrice) {
	    super();
	    this.stockname = stockname;
	    this.lastTradingPrice = lastTradingPrice;
	}


	public String getStockname() {
	    return stockname;
	}


	public void setStockname(String stockname) {
	    this.stockname = stockname;
	}


	public Double getLastTradingPrice() {
	    return lastTradingPrice;
	}


	public void setLastTradingPrice(Double lastTradingPrice) {
	    this.lastTradingPrice = lastTradingPrice;
	}

	@Override
	public int compareTo(Stocksfeb17  o) {
	    
	   // return this.stockname.compareTo(o.getStockname());
	    return this.lastTradingPrice.compareTo(o.getLastTradingPrice());
	}

	@Override
	public String toString() {
	    return "Stock [stockname=" + stockname + ", lastTradingPrice=" + lastTradingPrice + "]";
	
	

}
}
