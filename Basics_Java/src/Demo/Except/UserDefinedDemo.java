package Demo.Except;

public class UserDefinedDemo {

	//public static void main(String[] args) throws  SessionElevenCustomException{
		
		
//		throw new SessionElevenCustomException("Throwing for the first time");

	
	public static void main(String[] args) throws InvalidArgumentsException {

	    throw new InvalidArgumentsException("Throwing user defined exception");
	}
	
	
	}


