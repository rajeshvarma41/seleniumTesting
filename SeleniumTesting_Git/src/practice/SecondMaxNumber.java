//Program to find the second max number in an array
package practice;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] arr={12,13,3,42,14,5};
		int max=arr[0];
		int secondMax=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {   //this condition is standard to find max number
				max=arr[i];
			}
			
			if(arr[i]>secondMax && arr[i]<max) { //this is important condition to check to get the secnd max
				secondMax=arr[i];
			}
		}
		
		System.out.println("Maximum value of array is "+max);
		System.out.println("Second maximum value of array is "+secondMax);

	}

}
