# Recursion Practice Exercise
```Java
    public int fibonacci(int n) {
        if(n == 1)
            return 1;
        else if(n == 0)
            return 0;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
```

1. Using the fibonacci function above, **hand-trace** the execution path for a call to `fibonacci(4)` on a sheet of paper.

2. Now **hand-trace** the execution path for a call to `fibonacci(5)` on a sheet of paper.