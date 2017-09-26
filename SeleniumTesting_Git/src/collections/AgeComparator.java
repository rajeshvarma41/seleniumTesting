//This class defines comparison logic based on the age.
//This class which has logic should implement comparator
package collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<MovieStar>{

	@Override
	public int compare(MovieStar o1, MovieStar o2) {//we need to implement this method of comparator interface.
		return o1.age-o2.age;
		
		/* we can write below way also
		 if(this.age==st.age)  
		return 0;  
		else if(this.age>st.age)  
		return 1;  
		else  
		return -1; 
		 */
		
		
	}

	

}
