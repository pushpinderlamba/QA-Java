package Gen.types;

public class CompairUtils {

	public static void main(String[] args) {
		

			

			Pair<String, Integer> u1 = new Pair<>("MS Word", 101);
			Pair<String, Integer> u2 = new Pair<>("MS Word", 101);

			boolean  res = compare(u1, u2);

			System.out.println(res);
			}

			public static <T, U> boolean compare(Pair<T,U> p1, Pair<T,U> p2) {

			if(p1.getKey().equals(p2.getKey()) && p1.getVal().equals(p2.getVal())) {
			    return true;
			}else {
			    return false;

	}

}
		
}