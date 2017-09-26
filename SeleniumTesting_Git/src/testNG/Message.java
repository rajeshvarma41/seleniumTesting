//This a class created to understand Suite Test in TestNG

package testNG;

public class Message {
	
	private String message;
	
	//Constructor
	public Message() {
		
	}

	//getters and Setters
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//Class Methods (These we are using as business logic to test)
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String saluteMessage() {
		message="Hi"+message;
		System.out.println("HI"+message);
		return message;
	}
	

}
