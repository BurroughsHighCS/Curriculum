## Looping Exercise 2 (For Loops)

1. Here are some valid for loops. See if you can understand what they do before running them. Write down your predictions, then try running them to verify:

```java
    for(int i = 0; i <= 100; i += 2) {
        System.out.println(i);
    }
```

```java
    for(int i = 0; i <= 100; i += 3) {
        if(i % 2 == 0) {
            System.out.println(i + " is an even number");
        }
        else {
            System.out.println(i + " is an odd number");            
        }
    }
```

```java
    for(int i = 0; i < 1000; i += i) {
        System.out.println(i);
    }
```

```java
    for(int i = 100; i < 0; i--) {
        System.out.println(i);
    }
```

2. The following for loops will execute infinitely. Determine why and fix them:

```java
    for(int i = 0; i > -100; i++) {
        System.out.println(i);
    }
```

```java
    for(int i = 0; i < 20; i *= 2) {
        System.out.println(i);
    }
```

3. Write loops to do the following:
    * Print all of the multiples of 3 from 0 to 99
    * Print all of the powers of 2 from 1 to 1024

4. [Optional Challenge] Write a loop that gives a user only 3 chances to enter a valid integer. If the user fails to enter a valid integer within 3 tries, print "You fail" and terminate the program. If the user enters a valid integer, the program prints "Success" and terminates.