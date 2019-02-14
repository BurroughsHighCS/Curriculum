class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;

	public static void main(String[] args) {


	}

	public static void toggleCruiseControl() {

	}

	public static void accelerate(int accelerateSpeed) {
		if() {
			if(speed <= MAX_SPEED) {
				//should accelerate
				speed += accelerateSpeed;
				if(speed > MAX_SPEED) {
					speed = MAX_SPEED;
				}
			} else {
				System.out.println("Max speed reached.");
			}
		} else {
			System.out.println("Turn on Cruise Control first !!!") ;			
		}


		if (cruiseControlSet && speed <= MAX_SPEED) {
			//should accelerate
			speed += accelerateSpeed;
			if(speed > MAX_SPEED) {
				speed = MAX_SPEED;
			}
		}
		else if (!cruiseControlSet) {
			System.out.println("Turn on Cruise Control first !!!") ;
		}
		else {
			System.out.println("Max speed reached.");
		}

		System.out.println("Current speed: \t" + speed + "mph");

		if(exceedsWarningThreshold(speed)) {
			alert(false);
		}
	}

	public static void decelerate() {

	}

	public static void reportSpeed() {

	}

	public static void alert(Boolean isDecelerating) {

	}

	public static Boolean exceedsWarningThreshold(int speed) {

	}
}
