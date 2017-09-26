package practice;

//Program to understan swappin two elements in an array using function when we have the indexes
//Here we have function that does the same.
public class SwapArrElmtsFunct {

	public static void main(String[] args) { //main function that we are using to test below bubble sort fucntion
		int[] arr={20,30,40,60,80};  //creating an array
		System.out.println("printing array elements before swap");
		for(int i=0;i<4;i++)
		 {
			System.out.println(arr[i]);
		 }
		swapArr(arr,2,3); //passing array and indexes that you want to interchange.
		
		System.out.println("printing array elements after swap");
		for(int i=0;i<4;i++)
		 {
			System.out.println(arr[i]);
		 }

	}
	
	public static void swapArr(int[] arr, int i, int j) {//arguments are array and indexes that you want to interchange
		int temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
