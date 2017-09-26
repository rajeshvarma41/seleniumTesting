//Program to display unique elemets in an array
//Note: here we are just displaying unique elements and we are not doing any manipulation on the array.
package practice;

public class DisplayUniqueElemArray {
	
	//Function that displays unique elements in array
	public static void uniqueElem(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			Boolean distinct=false;  //we are using this to validate the condition for break
			for(int j=0;j<i;j++) {  //we are looping and checking if we were able to find it from earlier values till i
				if (arr[i]==arr[j]) {
					distinct=true;
					break;
				}
			}
			
			if(distinct==false) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		//We are creating array and passing the array to function
		Integer[] array1={12,1,2,12,34,12,2,4,1};
	    uniqueElem(array1);	

	}

}
