class CruiseControl {
  static Boolean cruiseControlSet = false;
  static int speed = 0;
  static final int MAX_SPEED = 45;
  static int warningSpeed = 25;

  public static void main(String[] args) {
    toggleCruiseControl();
    incrementSpeed();
    incrementSpeed();
    incrementSpeed();
    incrementSpeed();
    incrementSpeed();
    incrementSpeed();

    decrementSpeed();

    toggleCruiseControl();
    reportSpeed();
  }

  public static void toggleCruiseControl() {
    cruiseControlSet = !cruiseControlSet;
    if(!cruiseControlSet) {
      System.out.println("Cruise Control Disabled");
      speed = 0;
    }
    else {
      System.out.println("Cruise Control Enabled");
    }
  }

  public static void incrementSpeed() {
    if(cruiseControlSet && (speed < MAX_SPEED)) {
      speed += 5;
    }

    System.out.println("Accelerated 5mph");
    reportSpeed();

    if(speed > warningSpeed) {
      alert(true);
    }
  }

  public static void decrementSpeed() {
    if(cruiseControlSet && (speed > 0)) {
      speed -= 5;
    }

    System.out.println("Decelerated 5mph");
    reportSpeed();

    if(speed > warningSpeed) {
      alert(false);
    }
  }

  public static void reportSpeed() {
    System.out.println("Current speed is: " + speed + "mph");
  }

  public static void alert(Boolean isDecelerating) {
    if(isDecelerating) {
      System.out.println("Warning, current speed still exceeds warning threshold.");
    }
    else {
      System.out.println("Warning, current speed exceeds warning threshold.");
    }
    System.out.println("Your speed:\t\t" + speed + "mph");
    System.out.println("Warning Threshold:\t" + warningSpeed + "mph");
  }


}
