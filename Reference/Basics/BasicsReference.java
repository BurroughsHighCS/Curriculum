//Declare a class
public class BasicsReference {
	public static void main(String[] args) {
		//Declare a String
		String message = "Hello";
		//Print the string
		System.out.println(message);
		//Reassign that String
		message = "Goodbye";
		//Print the new string
		System.out.println(message);

		//Declare an int
		int num = 42;
		//Mutate that integer
		num = num + num; //Multiply by two and reassign (84)
		num += num; //Multiply by two and reassign (168)
		num *= 2; //Multiply by two and reassign (334)
		
		//Divide by 3 (111) - Remainder of 1 disappears
		System.out.println(num / 3); 
		System.out.println(num); //Still 334

		//What's the remainder of (num / 3)?
		System.out.println(num % 3) //(1)
	}
}
