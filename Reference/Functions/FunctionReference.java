public class Reference {
	// Declare Class-wide properties
	public static String greeting = "Hello";

	/* If this class will be run from terminal, declare a main
	 * Main has to be static, because it must be run without
	 * constructing an instance of the class.					*/
	public static void main(String[] args) {
		//Class-wide properties are available inside any function
		System.out.println(greeting);

		/* Call two functions, both taking parameter inputs:
		 * getGreeting doesn't print the string, it returns it.
		 * We can call it as a parameter to the System.out.println
		 * because println expects a String parameter input. 	*/
		String target = "World";
		System.out.println(getGreeting(target));

		//We can also use a string literal as the innermost param
		System.out.println(getGreeting("User"));
	}

	public static String getGreeting(String target) {
		/* Concatenate 2 strings. Print result
		 * Note that greeting was not passed as a param.
		 * It's available class-wide.							*/
		 return message + " " + target;
	}
}