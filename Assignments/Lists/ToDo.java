import java.util.Scanner;

class ToDo {
	public static final int ADD_ITEM = 1;
	public static final int REMOVE_ITEM = 2;
	public static final int TERMINATE = 3;
	
	public static void main(String[] args) {
		Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == ADD_ITEM) {
					addItem();
                }
                else if(mode == REMOVE_ITEM) {
					removeItem();
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
		//TODO: Implement the add item function
	}

	public static void removeItem() {
		//TODO: Implement the remove item function
	}

	public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Enter Item\n"
            + "\t(2) Remove Item\n"
            + "\t(3) Quit\n"
        );
    }
}