package practice;

/*given array of numbers. Write program where every index in output should have
have product of other index numbers
Example :{5,7,10,2} ; o/p {140,100,70,350}
*/
public class ArrayIndexProduct {

	public static void main(String[] args) {
		int[] a={5,7,10,2};
		int b[]=new int[4];
		
		for(int i=0;i<4;i++) { //this variable is to traverse array b
			int prod=1;
		for(int j=0;j<4;j++) {//this variable is to traverse array a
		
			if(i!=j) { //doing product only when indexes are different
			
			prod=prod*a[j];
			
			}
				
			}	
		b[i]=prod;
		}
		//printing the values in array b
		for(int i=0;i<4;i++) {
			System.out.println(b[i]);
		}
	}
}

