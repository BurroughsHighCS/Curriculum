# Looping Exercise #1 (While Loops)

1. Here are some example while loops. Read through them and see if you can understand what they will do before testing them. Write your prediction down. Once you've made predictions for all five, make a new java file and test them out to see if you were right:

```java
    int n = 0;
    while(n < 100) {
        System.out.println(n);
        n *= 5;
    }
    //In particular, is the last thing printed what you expected?
```

```java
    int n = 19;
    while(n % 2 == 0) {
        System.out.println(n);
        n--;        
    }
```

```java
    int n = 1;
    while(n < 100) {
        System.out.println(n);
        n += n;        
    }
```

```java
    Boolean shouldLoop = true;
    int n = 0;
    while(shouldLoop) {
        if(n == 20) {
            shouldLoop = false;
        }
        System.out.println(n);
        n++;
    }
```

```java
    int n = 0;
    while(true) {
        System.out.println("Hello World");
        n++;
        if(n == 10){
            break;
        }
    }
```

2. The following loops will run infinitely. Determine why and fix them:

```java
    int n = 1;
    while(n < 10) {
        System.out.println(n);
    }
```

```java
    Boolean shouldLoop = true;
    int n = 1;
    while(shouldLoop) {
        if(n == 100) {
            System.out.println("100 loop passes occured.");
        }
        n++;
    }
```

3. Write your own while loops to do the following:
    * In descending order, print all of the numbers from 100 to -100 (including 100 and -100).
    * Print all multiples of 3 up to 120
        * e.g. 3, 6, 9... 117, 120
    * Print the letters a through z
        * HINT: There is a data type called ```char``` (short for 'character') that helps with this.
        ```java
            char alpha = 'a';
            System.out.println(alpha); //Prints 'a'
            alpha++;
            System.out.println(alpha); //Prints 'b'
        ```
        The increment operator on a char increments it to the next alphabetical character.