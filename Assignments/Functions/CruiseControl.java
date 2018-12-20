class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;

	public static void main(String[] args) {
		toggleCruiseControl();

		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
		accelerate();
	}

	public static void toggleCruiseControl() {
		cruiseControlSet = !cruiseControlSet;

		if(cruiseControlSet) {
			System.out.println("Cruise Control Enabled");
		} else {
			System.out.println("Cruise Control Disabled");
			speed = 0;
		}	
	}

	public static void accelerate() {
		if (cruiseControlSet && speed < MAX_SPEED) {
			speed += 5;
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
		if(isDecelerating) {
			System.out.println("Speed still exceeds the warning threshold.");
		}
		else {
			System.out.println("Speed exceeds the warning threshold.");			
		}
	
		System.out.println("Threshold: \t" + speed + "/" + warningSpeed + "mph");
	}

	public static Boolean exceedsWarningThreshold(int speed) {
		return speed > warningSpeed;
	}
}
