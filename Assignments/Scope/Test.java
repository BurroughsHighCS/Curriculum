class Test {

    public static void main(String[] args) {
        String message = "Hello";
        int n = 2;
        if(isEven(n)) {
            System.out.println("n is Even.");
        }

        int m = 1;
        if(isEven(m)) {
            System.out.println("m is Even");
        }
    }

    public static Boolean isEven(int x) {
        System.out.println(message);
        return x % 2 == 0;
    }
}
