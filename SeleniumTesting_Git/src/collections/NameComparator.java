//This class defines comparison logic based on the name.
//This class which has logic should implement comparator
package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<MovieStar>{

	@Override
	public int compare(MovieStar ms1, MovieStar ms2) {//we need to implement this method of interface.
		
		return ms1.name.compareTo(ms2.name); //compareTo for less than, greater than or equals. Mainly used in sortings.
	}

}
