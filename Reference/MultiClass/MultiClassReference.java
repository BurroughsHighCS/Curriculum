import util.Greeter; //import from our util package.

public class MultiClassReference {
	// We run this class form terminal, so only it gets a main function.
	public static void main(String[] args) {
		/* Now that we've created and imported the Greeter class,
		 * it can be used like any other data (variable) type.
		 * Similar to a String or Boolean, we can make a Greeter.
		 * The syntax is slightly different, as we need to call one
		 * of the Greeter class's Constructors.						 */
		
		/* Using default constructor. This Greeter will initialize
		 * using the default values of message = "hello" and
		 * target = "world" 										 */
		Greeter g = new Greeter();
		//Calling g1's greet function will print its message + target.
		g.greet(); //Prints "Hello World";

		/* Overwrite g with a new, customized greeter.
		 * Using non-default constructor. This Greeter will initialize
		 * using the values we supply to set its message and target. */
		Greeter g = new Greeter("Greetings,", "Peasant.");
		g.greet(); //Prints "Greetings, Peasant."
	}
}