//Program to understand primitive character type and CharacterClass
public class CharacterDataType {

	public static void main(String[] args) {
		//primitive character datatype
		char ch='a';
		
		//Using Character class
		Character ch1=new Character('b');
		
		//printing using primitive datatype
		System.out.println(ch);
		
		//printing using character class
		System.out.println(ch1.charValue());
		
		//When we use characterClass we have lot of methods that we can use
		
		System.out.println(ch1.toString());
		System.out.println(ch1.BYTES);
	}

}
