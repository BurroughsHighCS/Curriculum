class Example {
	public static void main(String[] args) {
		int n = power(2,3);
		System.out.println(n);


	}

	public static Boolean isEven(int x) {
		return x % 2 == 0;
	}

	//2, 4
	public static double power(int num, int exponent) {
		if(exponent < 0) {
			return -1;
		}
		else if(exponent = 0){
			return 1;
		}


		int base = num;
		for(int i = 1; i < exponent; i++) {
			num *= base;
		}
		return (double) num;

	}

}