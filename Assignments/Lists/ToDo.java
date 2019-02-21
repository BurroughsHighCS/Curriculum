import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ToDo {
	public static final int ADD_ITEM = 1;
	public static final int REMOVE_ITEM = 2;
	public static final int MOVE_ITEM = 3;
	public static final int TERMINATE = 4;
    public static int mode = -1;

    public static List<String> todos;

	public static void main(String[] args) {
        todos = new ArrayList<String>();

		Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printList();
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == ADD_ITEM) {
					addItem();
                }
                else if(mode == REMOVE_ITEM) {
					removeItem();
                }
                else if(mode == MOVE_ITEM) {
                    moveItem();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
	}

	public static void addItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an item to add to your list.");
        String input = scan.nextLine();

        //Add the user entered item
	}

	public static void removeItem() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the index of the item they'd like to remove from your list: ");
            if(scan.hasNextInt()) {
                int idx = scan.nextInt();
                if(idx >= 0 && idx < todos.size()) { //is it a valid index?
                    //Remove the item at user requested index

                    break;
                }
            }
        }
	}

    public static void moveItem() {
        Scanner scan = new Scanner(System.in);
        int start = -1;
        int dest = -1;
        while(true) {
            System.out.print("Enter the index of the item you'd like to move: ");
            if(scan.hasNextInt()) { //is it a valid integer?
                start = scan.nextInt();
                if(start >= 0 && start < todos.size()) { //is it a valid start index?
                    break;
                }
            }
        }

        while(true) {
            System.out.print("Enter the index of the desired destination: ");
            if(scan.hasNextInt()) {
                dest = scan.nextInt();
                if(dest >= 0 && dest <= todos.size()) { //is it a valid destination index?
                    break;
                }
            }
        }

        //Move item from start index to (before) the destination index
    }

    public static void printList() {
        System.out.println(""); //empty line for spacing above

        //Print each item in the list

        System.out.println(""); //empty line for spacing below
    }

	public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t[1] Enter Item\n"
            + "\t[2] Remove Item\n"
            + "\t[3] Move Item\n"
            + "\t[4] Quit\n"
        );
    }
}