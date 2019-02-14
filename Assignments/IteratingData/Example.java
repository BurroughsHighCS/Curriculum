class Example {
	public static void main(String[] args) {
		int[] powers = new int[32];

		for(int i = 0; i < powers.length; i++) {
			powers[i] = (int) Math.pow(2, i);
			System.out.println(powers[i]);
		}

		// System.out.println((int)Math.pow(2,31));
		// System.out.println((int)Math.pow(2,32));
		// System.out.println((int)Math.pow(2,33));

		for(int p : powers) {
			p++;
			System.out.println(p);
		}

		for(int p : powers) {
			System.out.println(p);
		}
	}
}