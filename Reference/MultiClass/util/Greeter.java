package util;

public class Greeter {
	private String greeting;
	private String target;

	//Default Constructor
	public Greeter() {
		//If the user doesn't specify, we will greet the world.
		greeting = "Hello";
		target = "World";
	}

	//Custom (Parameterized) Constructor
	public Greeter(String _greeting, String _target) {
		/* The provided "_greeting" is assigned to the class's 
		 * "greeting" property. 
		 * _greeting will be provided by calls to this class's 
		 * contructor. Each instance of the greeter class
		 * remembers its assigned greeting.							 */
		greeting = _greeting;
		target = _target;
	}

	public void greet(){
		//The greet function actually performs the greeting
		System.out.println(greeting + " " + target);
	}
}