//Program works for swapping values. Here we are passing array reference to function and using array reference we are manipulating the value of array.
public class swapFunctionRight {

	public static void main(String[] args) {
		int[] array=new int[2];
		array[0]=20;
		array[1]=30;
		
		//printing values before swap
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		swap(array); //we are passing the reference value of an array.
		
		//printing values after swap
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

	public static void swap(int[] arr) {
		int temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
	}
	
	

}
