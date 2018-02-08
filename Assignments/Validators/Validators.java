import java.util.Scanner;

class Validators {
    public static void main(String args[]) {
        String s;
        int n;
        double d;
        Boolean bool;

        // System.out.print("Enter a string: ");
        // Scanner scan = new Scanner(System.in);
        // if(isValidString(scan)) {
        //     System.out.println("String Success!");
        // }
        // else {
        //     System.out.println("String Failure!");
        // }

        // System.out.print("Enter an int: ");
        // scan = new Scanner(System.in);
        // if(isValidInt(scan)) {
        //     System.out.println("Int Success!");
        // }
        // else {
        //     System.out.println("Int Failure!");
        // }

        // System.out.print("Enter a double: ");
        // Scanner scan = new Scanner(System.in);
        // if(isValidDouble(scan)) {
        //     System.out.println("Double Success!");
        // }
        // else {
        //     System.out.println("Double Failure!");
        // }

        System.out.print("Enter a boolean (t/f): ");
        Scanner scan = new Scanner(System.in);
        if(isValidBoolean(scan)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
    }

    
    public static Boolean isValidString(Scanner scan) {
        try {
            String s = scan.nextLine();
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isValidInt(Scanner scan) {
        try {
            int n = scan.nextInt();
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isValidDouble(Scanner scan) {
        try {
            double n = scan.nextDouble();
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }

    public static Boolean isValidBoolean(Scanner scan) {
        String s = scan.nextLine();
        return s.charAt(0) == 't' || s.charAt(0) == 'f' || s.charAt(0) == 'F' || s.charAt(0) == 'T';
    }
}