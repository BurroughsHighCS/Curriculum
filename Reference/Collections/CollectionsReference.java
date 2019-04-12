public class CollectionsReference {
	//uninitialized Arrays
	private int[] powers;
	private Greeter[] greeters;
	//uninitialized Lists
	private List<String> messages;
	private List<Greeter> greeters;

	public static void main(String[] args) {
		System.out.println(powers[0]); //Throws an error.
		//powers array is still null. It has NO positions

		//let's fill the powers array.
		powers = new int[30];
		powers[0] = 1;
		for(int i = 1; i < powers.length){ 
			powers[i] = powers[i-1] * 2;
		}
	}
}