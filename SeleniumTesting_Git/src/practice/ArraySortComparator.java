//Sorting the array of String using sort method(with comparator) in java.util
package practice;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortComparator {

	public static void main(String[] args) {
		String strArr[]={"John","Bosco","Rajesh"};
		Arrays.sort(strArr,new Comparator<String>() {  //Here itself we are defining constructo in short way instead of creating comaparator seperately that Implements comparator and then using here

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
	//Printing the values of the sorted array
		for(String str:strArr){
			System.out.println(str);
		}
		
	}
}
