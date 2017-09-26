import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Program to understand reular expressions in java
//Regular expression in java defines a pattern for a String. Regular Expression can be used to search, edit or manipulate text.
//Regular expression is not language specific but they differ slightly for each language. Regular Expression in java is most similar to Perl.
/*
 * Java Regex classes are present in java.util.regex package that contains 3 classes
 * Pattern: Pattern object is the compiled version of the regular expression. Pattern class doesn’t have any public constructor and we use it’s public static method compile to create the pattern object by passing regular expression argument.
 * Matcher: Matcher is the java regex engine object that matches the input String pattern with the pattern object created. Matcher class doesn’t have any public constructor and we get a Matcher object using pattern object matcher method that takes the input String as argument. We then use matches method that returns boolean result based on input String matches the regex pattern or not.
 * PatternSyntaxException: PatternSyntaxException is thrown if the regular expression syntax is not correct.
 */
public class RegexTest {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile(".xx.");  //creating a pattern object
		Matcher matcher=pattern.matcher("MxxY");  //creating a matcher object
		boolean isMatched = matcher.matches();//It matches the regular expression against the whole text passed to the Pattern.matcher() method
		
		System.out.println("Input String matches regex - "+isMatched);
		
		// bad regular expression
		pattern=Pattern.compile("*xx*");  //when we run this gives PatternSyntaxException as we have provided invalid regular expression here

}
/*More info available on different methods of patter classs, matcher class at http://beginnersbook.com/2014/08/java-regex-tutorial/  . 
 * Aslo you can read on how pattern.matches is id different from string.matches etc*/
	
}