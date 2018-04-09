# 2 Dimensional Arrays

# Example
```Java
    int[][] twoDArray = new int[3][3];

    for(int i = 0; i < twoDArray.length; i++) {
        for(int j = 0; j < twoDArray[i].length; i++) {
            twoDArray[i][j] = i * (j + 1);    
            System.out.println(twoDArray[i][j]);
        }
    }
```