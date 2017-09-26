package practice;

//Program to understand sorting elements in an array using function when we have the array
//Here we have function that does the same.
public class BubbleSortFunction {

	public static void main(String[] args) { //main function we created to test the below bubble sort function
		int[] a={20,45,86,12,60,0}; //creating an array
		
		//printing elements of array before sorting
		System.out.println("Array elements before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//Calling below bubble sort function
		bubbleSort(a); //passing array as argument
		
		//printing elements of array after sorting
		System.out.println("Array elements before sorting");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
				
	}
	
	public static void bubbleSort(int[] arr) { //This is bubble sort function we are implementing. So this can be called and used by any class
		for (int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length-1-i;j++) {//Here note the condition. Otherwise it goes out of exception
				if(arr[j]>arr[j+1]) {
					SwapArrElmtsFunct.swapArr(arr, j, j+1); //imp to note here, again instead of writing all swap logic we are using the swap function that we wrote.
				}										//we need to pass array and indexes		
			}
		}
			
	}

}
