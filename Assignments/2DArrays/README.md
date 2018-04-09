# 2 Dimensional Arrays
2-Dimensional Arrays, also known in the math world as _matrices_, are pretty important in programming. They are used frequently in graphics rendering engines, to name one application.

In programming, we can perform matrix operations by storing data inside a 2-Dimensional array, or an _array of arrays_.

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

* Note the first loop uses `twoDArray.length`
    * While `twoDArray` contains 9 items, `twoDArray.length` returns 3.
        * Because `twoDArray` is _an array of arrays_, its `length` property returns the _number of arrays_ inside it.
        * Each array _within_ `twoDArray` also has a length of three, so:
        * ```Java
        twoDArray[0].length == 3;
        twoDArray[1].length == 3;
        twoDArray[2].length == 3;

        twoDArray[0].length + twoDArray[1].length + twoDArray[2].length == 9;

* In matrix algebra, you would refer to the items of a matrix using the syntax `matrix(x,y)`. We do something similar in programming, where we use brackets `matrix[x][y]`.
    * To _read_ the value at position (0,0), we call `twoDArray[0][0]`.
    * To _set_ the value at position (0,0), we call `twoDArray[0][0] = 1`.