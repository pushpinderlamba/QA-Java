package Session8Extendingclasses;

public class RoadCycle extends Bicycle{
	
	private int tyrewidth;
	
	public RoadCycle() {
		super();
		
	}

	public RoadCycle(String brand,int gears,int width) {
		
		super(gears, brand);
		this.tyrewidth = width;
	}
	public int getTyrewidth() {
		return tyrewidth;
	}

	public void setTyrewidth(int tyrewidth) {
		this.tyrewidth = tyrewidth;
	}
	
	

}
