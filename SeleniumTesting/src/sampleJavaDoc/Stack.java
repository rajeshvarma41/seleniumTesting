//This below program is created just to understand the javadoc. This program desnt perform any  operation, Just understanding different tags
// we use /**--*/ for javadocs. Javadoc is a subsystem of the Java Development Kit that lets the programmer create useful documentation very easily.
//From eclipse ->Project->Generate Javadoc->(provide javadoc.exe path in Javadoc command
//Now doc folder is created. Under doc->inden.html->right click->open in browser
/*
 * @return is used to give the intent of the value returned by the function

@param gives the intent of any input parameter. The name of the param immediately follows @param.

@exception is intended to say under what conditions an exception will be thrown. The @exception is followed by the exception name.

@author gives the author of the code. Generating these comments is optional as is @version.
 */
package sampleJavaDoc;

import java.util.NoSuchElementException;

/**
 * This stack class represents a last in first out stack of objects
 * @author RVarma
 * @version 2.0
 */
public class Stack {

	/**
	 * Pushes an item to the top of the stack
	 * @param item Item to be pushed on to top of the stack. 
	 * 
	 */
	public void push(Object item) {
		
	}
	
	/**
	 * Removes the object from top of the stack and returns the object
	 * @return the object at the top of the stack
	 * @exception NoSuchElementException if stack is empty
	 */
	public Object pop() throws NoSuchElementException{
		Object obj1=null;
		return obj1;
	}
	
	/**
	 * 
	 * @param a Object name
	 * @return total number of objects in stack.
	 */
	public int stackSize(Object a) {
		int i=0;
		return i;
	}
	
	
}
