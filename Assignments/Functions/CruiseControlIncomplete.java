
___________  _________________ {

    static ________ cruiseControlSet = ___________;

    static int speed = ___________;

    static final ______ MAX_SPEED = ___________;

    static _______ warningSpeed = ___________;

    public static void main(String[] args) {




    }

    public static void toggleCruiseControl() {

        cruiseControlsSet = _________________________;


        if( __________________________________ ) {

            System.out.println("Cruise Control Disabled.");

            ________  ____  ______;
        }
        else {

            System.out.println("_____________________________________________");   
        }
    }

    public static void incrementSpeed() {

        if( __________________________ && ( ______________ < _______________ )) {

            __________ _____ _____;
        }

        System.out.println("Accelerated 5mph");
        reportSpeed();

        if( exceeds___________________________________ ) {

            alert( _____________ );
        }
    }

    public static void decrementSpeed() {
        if(cruiseControlSet && (speed ___  ____ )) {

            ________  ____  _____;
        }

        System.out.println( _________________________________________ );

        _____________________________;

        if( _________________________________________________________ ) {
            
            _____________________________________;
        }
    }

    public static void ___________________ () {
        System.out.println("Current speed is:\t" + speed + "mph");
    }

    public static void alert( __________________ isDecelerating) {

        if( ________________________ ) {
            System.out.println("Warning, current speed still exceeds warning threshold.");
        }
        else {
            System.out.println("Warning, current speed exceeds warning threshold.");
        }
        System.out.println("Your speed:\t\t" + speed + "mph/" + warningSpeed + "mph");
    }

    public Boolean exceedsWarningThreshold() {

        if( _______________ > ___________________________ ) {    
            return true;
        }
        _________ ___
            return false;
        __    
    }
}
