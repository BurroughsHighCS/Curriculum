import java.util.Scanner;

class Formatting {
public static void main(String args[]) 
    {System.out.print("Enter a string: ");
Scanner scan = new Scanner(System.in);
if(isValidString(scan)) {System.out.println("String Success!");}
    else {
            System.out.println("String Failure!");}}

    
                public static Boolean isValidString(Scanner scan) {
            try {String s = scan.nextLine();
            }catch(Exception e) {
    return false;
            }return true;
}}