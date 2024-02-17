package Session8Extendingclasses;

//this class is derived class of base class Bicycle//

public class MountainBicycle extends Bicycle{
	
	int seatElevation;
	
	public MountainBicycle() {

}
	
	public MountainBicycle(String brand,int nogears,int elevation) {
		// super word help us to declare parameter //
		super(nogears,brand);
		
		this.seatElevation = elevation;
	}

	public int getSeatElevation() {
		return seatElevation;
	}

	public void setSeatElevation(int seatElevation) {
		this.seatElevation = seatElevation;
	}
	 public void stopMountainBicycle() {
		 
		 super.applyBrakes();
	 }
}