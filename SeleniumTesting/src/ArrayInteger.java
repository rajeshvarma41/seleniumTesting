//Delcaring , Initializing and printing elements in array
public class ArrayInteger {

	public static void main(String[] args) {
		int[] arr=new int[4];  //first way declaration of array;
		
		//initializing the array
		arr[0]=2;
		arr[1]=3;
		arr[2]=15;
		arr[3]=90;
		
		int[] arr1={12,35,66,77};  //second way of declaration. Here declaration and intialization comnined;
		
		//printing elements of an array from first way of declaration
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		//printing elements from second way of array declared
		for(int x=0;x<arr1.length;x++)
		{
			System.out.println(arr1[x]);
		}
		
		
	}

}
