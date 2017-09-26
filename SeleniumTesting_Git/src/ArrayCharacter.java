//Program to create , initialize and displaying character array
public class ArrayCharacter {

	public static void main(String[] args) {
		char[] charArray= new char[26]; //one way of delcaration of array
		char[] charArray1= {'r','b','e','l'}; // second way of declaring and intitalizing an array
		
		//Inititalizing array from the first way of declaration
		//using for loop to intialize array, by filling with all alphabets
		int index=0;
		for(char c='a';c <='z';c++) //this will increment ascii code that we will have alphabets
		{
			charArray[index]=c;
			index++;
		}
		
		//Printing values from second array
		for (int i=0; i<charArray1.length;i++){
			System.out.println(charArray1[i]);
		}
		
		//printing values from first array
		for (int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		
	}

}
