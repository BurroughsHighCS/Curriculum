## 1  
Consider the following two classes.

```Java
    public class Dog {
        public void speak() {
            System.out.println("Bark!");
        }
    }

    public class SmallDog extends Dog {
        public void speak() {
            System.out.println("Yap!");
        }
    }
```

What is printed as a result of executing the following code segment?

```Java
    Dog d = new SmallDog();
    d.speak();
```

```
    (A) Bark!
    (B) Yap!
    (C) Bark!Yap!
    (D) Yap!Bark!
    (E) The code results in a runtime error.
```

## 2
Consider the following code segment:

```Java
    for(int a = 1; a <= 3; a++) {
        for(int b = a; b <= 10; b += 2) {
            if(b % 3 == 0) {
                System.out.print(a += " ")
            }
        }
        System.out.println();
    }
```

What will be printed as a result of executing the code segment?

```
    (A) 3 6 9
        3 6 9
        3 6 9

    (B) 3 9
        3 9
        3 9

    (C) 3 9
        6
        3 9

    (D) 1 1
        2 2
        3 3

    (E) 1 1
        2
        3 3
```

## 3 
In Java, a variable of type `int` is represented internally as a 32-bit signed integer. Suppose that one bit stores the sign, and the other 31 bits store the magnitude (value) of the number in base 2. In this scheme, what is the largest value that can be stored as type `int`?


```
    (A) 2^32
    (B) (2^32) - 1
    (C) 2^31
    (D) (2^31) - 1
    (E) 2^30
```

## 4
Consider the following method.

```java
    public static boolean mystery(String str) {
        String temp1 = "";
        for(int i = 0; i < str.length() / 2; i++) {
            temp1 = temp1 + str.substring(i - 1, i);
        }

        String temp2 = "";
        for(int i = str.length(); i >= str.length() / 2; i--) {
            temp2 = temp2 + str.substring(i - 1, i);
        }
        return temp1.equals(temp2)
    }
```

Which of the following calls to `mystery` will return `true`?

```
    (A) mystery("an")
    (B) mystery("na")
    (C) mystery("aann")
    (D) mystery("anan")
    (E) mystery("anna")
```

## 5
Consider the following definition.

```java
    int[][] numbers = { {1, 3, 5}
                        {2, 4, 6} };
```

Which of the following code segments produces the output `123456`?

I.  
```java
    for(int[] row : numbers) {
        for(int num  : row) {
            System.out.print(num);
        }
    }
```

II. 
```java
    for(int[] col: numbers) {
        for(int num: col) {
            System.out.print(num);
        }
    }
```

III.
```java
    for(int c = 0; c < numbers[0].length; c++) {
        for(int r = 0; r < numbers.length; r++) {
            System.out.print(numbers[r][c]);
        }
    }
```

IV.
```java
    for(int r = 0; r < numbers.length; r++) {
        for(int c = 0; c < numbers[0].length; c++) {
            System.out.print(numbers[r][c]);
        }
    }
```

```
    (A) I only
    (B) II only
    (C) II & III
    (D) III only
    (E) III & IV
```

## 6
A game uses two twenty-sided dice numbered from 1 to 20. Which of the following code segments best represents rolling two of these twenty-sided dice and summing their values together? 

```
    (A) 2 * (int) (Math.random() * 20)
    (B) 2 * ((int) (Math.random() * 20) + 1)
    (B) 2 * (int) (Math.random() * 21)
    (C) (int) (Math.random() * 20) + (int) (Math.random() * 20)
    (D) (int) (Math.random() * 21) + (int) (Math.random() * 21)
```

## 7
Consider the following method.

```java
    public static void doStuff(int x) {
        if(x % 5  == 0) {
            System.out.print(x + " ");
        }
        else {
            doStuff(x + 3);
        }
    }
```

What will be printed as a result of the call `doStuff(1)`?

```
    (A) 10
    (B) 5 10
    (C) 1 4 7 10
    (D) 4 7 10
    (E) A stack overflow will occur.
```

## 8

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 9

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 10

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 11

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 12

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 13

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 14

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```

## 15

```
    (A) 
    (B) 
    (C) 
    (D) 
    (E) 
```
