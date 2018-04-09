# 2 Dimensional Arrays
2-Dimensional Arrays, also known in the math world as _matrices_, are pretty important in programming. They are used frequently in graphics rendering engines, to name one application.

# Example
```Java
    int[][] twoDArray = new int[3][3];

    for(int i = 0; i < twoDArray.length; i++) {
        for(int j = 0; j < twoDArray[i].length; j++) {
            twoDArray[i][j] = (i * 4) + (j + 1);
            System.out.println(twoDArray[i][j]);
        }
    }

    //Prints the numbers 1 - 9 from the following array:
    //[1, 2, 3]
    //[4, 5, 6]
    //[7, 8, 9]
```