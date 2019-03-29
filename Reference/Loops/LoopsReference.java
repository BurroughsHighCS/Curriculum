public class LoopsReference {
	private int[] powers = {1,2,4,8,16,32,64,128,256,512,1024};
	public static void main(String[] args) {
		//Standard while loop:
		int num  = 0;
		while(num < 100) {
			System.out.println(num);
			num++;
		}

		//Standard for loop:
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		//For Loop over the powers array:
		for(int i = 0; i < powers.length; i++) {
			System.out.println(powers[i]);
		}

		//For each loop over the powers array:
		for(int n : powers) {
			System.out.println(n);
		}
	}
}