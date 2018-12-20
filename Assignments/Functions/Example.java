class Example {
	static int year = 2018;
	static int birthYear = 2004;
	static String message = "Hi";

	public static void main (String[] args) {
		int age = calcAge(year, birthYear);
		printMessage("My age is: " + age);

		printMessage("My class message is: " + message);
	}

	public static int calcAge (int currentYear, int birthYear) {
		return currentYear - birthYear;
	}

	public static void printMessage (String message) {
		System.out.println(message);
	}
}