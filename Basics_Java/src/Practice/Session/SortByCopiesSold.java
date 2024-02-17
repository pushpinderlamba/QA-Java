package Practice.Session;

import java.util.Comparator;

public class SortByCopiesSold  implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
	
		return o1.getCopiesSold()-o2.getCopiesSold();
	}

}
