class DiceGame {
	public static void main (String[] args) {
		// int roll4 = getD4();
		// System.out.println("My d4 rolled a: " + roll4);
		// int roll6 = getD6();
		// System.out.println("My d6 rolled a: " + roll6);
		// int roll20 = getD20();
		// System.out.println("My d20 rolled a: " + roll20);

		int n = 0;
		int[] rolls = new int[21];
		while(n < 1000000) {
			rolls[getD20()]++;
			n++;
		}

		for(int i = 0; i < rolls.length; i++) {
			System.out.println("Number of rolls for value [" + i + "]: " + rolls[i]);
		}


	}

	public static int getD4() {
		return (int)(Math.random() * 4) + 1;
	}

	public static int getD6() {
		return (int)(Math.random() * 6) + 1;
	}

	public static int getD20() {
		return (int)(Math.random() * 20) + 1;
	}
}