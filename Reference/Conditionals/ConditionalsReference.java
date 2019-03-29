public class LoopsReference {
	public int[] numbers = {5,19,4,56,82,10,3,18,16,25,43};
	public static void main(String[] args) {
		if(1 > 2) { //will always evaluate as false
			System.out.println("This will never print.");
		} else if (2 > 1) { //will always evaluate true
			System.out.println("This will always print.");
		} else { //else only triggers if above were all false
			System.out.println("This also never prints.");
		}

		//Find a number in an array using equivalence conditions
		Boolean found = false;
		int numToFind = 18;
		for(int i = 0; i < numbers.length; i++) {
			//Is the number at current index the one we want?
			if(numbers[i] == numToFind) {
				//If so, we're done searching
				found = true;
				break;
			}
		}
		//found is set to true above if the number is in the array.
		if(found) {
			System.out.println("The number was found in the Array.");
		}

		//If a function returns Boolean, we can use it as a condition.
		int x = 2;
		if(isEven(x)) {
			System.out.println("x was even.");
		}
	}

	public static Boolean isEven(int x) {
		return x % 2 == 0;
	}
}