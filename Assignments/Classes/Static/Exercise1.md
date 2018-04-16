# Static Classes Exercise 1

1. Play with the random sentence generator and see if you can get any fun sentences out of it.
    * (Or don't, I guess, if you're too cool for silly fun)
    * You can add/modify subjects, objects, and verbs if you'd like. Nothing inappropriate in class, please.

2. Implement a `matrixTest1()` function. Using the `MatrixUtil` class, it should:
    * Generate a random 3x3 matrix.
    * Print the contents of that matrix to the terminal.

3. Implement a `matrixTest2()` function. Using the `MatrixUtil` class, it should:
    * Generate a "random" 4x4 matrix using the seed `1234`.
    * Print the contents of that matrix to the terminal.

4. Implement a `matrixTest3()` function. Using the `MatrixUtil` class, it should:
    * Generate the same matrix that was used in problem #2. 
        * This can be done by using the same seed `1234` and calling the `generateRandomMatrix(int rows, int cols, int seed)` method.
    * Reverse the contents of the matrix and then print them to the terminal.

5. Implement a `matrixTest4()` function. Using the `MatrixUtil` class, it should:
    * Generate a random 10x10 matrix.
    * Print the contents of that matrix to the terminal.
    * Reverse the contents of every **odd** numbered row.
    * Print the contents of the new matrix after the row-reversals.