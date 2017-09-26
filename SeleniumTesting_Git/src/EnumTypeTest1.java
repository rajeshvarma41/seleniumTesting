//The enum declaration defines a class (called an enum type). 
//The enum class body can include methods and other fields
// The compiler automatically adds some special methods when it creates an enum for examples values()
//You can obtain an array of all the possible values of a Java enum type by calling its values() method
public class EnumTypeTest1 {
enum Season{
	WINTER,
	SPRING,
	FALL,
	SUMMER,
}
	public static void main(String[] args) {
		Season s[]=Season.values();  //values method gives all the values of enum in an array
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			
		//Second way of printing using for enhanced for loop
			System.out.println("printing using enhanced for loop");
			for(Season s1:Season.values()) {
				System.out.println(s1);
			}
		}
	}

}
