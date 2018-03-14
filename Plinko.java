class Plinko {
    public static void main(String[] args) {
        int position = 4 * 2;

        // !(position > 16)
        // !(position < 0)

        printEvenRow(position);

        for(int i = 1; i <= 12; i++) {
            if(position == 0) {
                position++;
            } else if(position == 16) {
                position--;
            } else if(Math.random() > .5) {
                position++;
            } else {
                position--;
            }

            if(isEven(i)) {
                printEvenRow(position);
            } else {
                printOddRow(position);
            }
        }

    }

    public static void printEvenRow(int position) {
        for(int i = 0; i <= 16; i++) {
            if(i == position) {
                System.out.print("O");
            } else if (isEven(i)) {
                System.out.print(" ");
            } else {
                System.out.print(".");
            }
        }
    }

    public static void printOddRow(int position) {
        for(int i = 0; i <= 16; i++) {
            if(i == position) {
                System.out.print("O");
            } else if (isEven(i)) {
                System.out.print(".");
            } else {
                System.out.print(" ");
            }
        }
    }
}