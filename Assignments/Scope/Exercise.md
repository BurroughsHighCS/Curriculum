# Variable Lifetime (Scope) Exercise
1. The following class has several errors with variable scope. Put it in a ```.java``` file and try compiling it, then use the errors to track down all of the scope errors and fix them:

```Java
    class ScopeTest {
        public static String message = "Hello";
        public static Boolean shouldLoop = false;

        public static void main(String args[]) {
            int i;
            while(i <= 10) {
                int n = i * 2;
                System.out.println(n);
                i++;
            }

            if(n > 10) {
                String message = "Hello World";
                System.out.println(message);
            }

            Boolean shouldLoop = true;
            int i = 0;
            while(shouldLoop) {
                if(i < 10) {
                    System.out.println(message);                    
                } else {
                    Boolean shouldLoop = false;
                }
                i++;
            }
        }
    }
```

2. The following ```for``` loop runs until it finds the 'W' in the string "Hello World":
```Java
    String message = "Hello World";
    for(int i = 0; i < message.length(); i++) {
        if(message.char(i) == 'W') {
            break;
        }
    }
```

The loop's index ```i``` will be ```6``` when the for loop terminates. The code below tries to print that index, but fails:

```java
    String message = "Hello World";
    for(int i = 0; i < message.length(); i++) {
        if(message.charAt(i) == 'W') {
            break;
        }
    }
    System.out.println("W found at index " + i);
```

Alter the code so the print statement works _as is_ (don't change or move the print statement).
(Hint, ```i``` dies once it leaves the for loop)

3. The following class tries to execute a "power" function to print the first ```n``` powers of 2, but it's incomplete. Finish the code to successfully run the power function:
```Java
class Powers {
    public static void main(String[] args) {
        int n = 32;
        int base = 2;
        for(int i = 0; i <= n; i++) {
            power();
        }
    }

    public static void power() {
        return -1;
    }
}
```
