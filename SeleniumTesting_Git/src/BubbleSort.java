//Program for Bubble sort. Here we didnt use any scan and used fixed number of integers

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a=new int[6];
		a[0]=12;
		a[1]=25;
		a[2]=3;
		a[3]=26;
		a[4]=13;
		a[5]=4;
		
		for(int j=0;j<5;j++) {
		
		for(int i=0;i<5;i++) {
			if (a[i]>a[i+1]) {
				int temp;
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}

		//printing elements of array
		
		for (int i=0;i<=5;i++)
			System.out.println(a[i]);
		
	}

}
