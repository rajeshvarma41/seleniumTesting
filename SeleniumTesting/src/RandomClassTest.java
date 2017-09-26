import java.util.Random;

//This program is to understand Random class in java and its methods..Note this program gives different results each time you run
//Important:  Math.random generates always doubles between 0 (inclusive) and 1 (exclusive). So if you want to generate random integers this would be better

public class RandomClassTest {

	public static void main(String[] args) {
		Random rnd=new Random();
		int randomInt=rnd.nextInt(); //this method generated random integer out of the whole possible values of interger
		System.out.println(randomInt);  
		
		int randomInt1=rnd.nextInt(10); //this method generated random integer between 0 and 10
		System.out.println(randomInt1);
		
		float randlomFlt=rnd.nextFloat();  //this method generated random floating number between 0 and 1
		System.out.println(randlomFlt);  
		
		System.out.println(Math.random());// this is using math.random and this always gives double number between 0 and 1
		
	}

}
