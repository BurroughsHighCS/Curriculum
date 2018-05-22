# Recursion
![Pooh Comic](./Recursion.jpg)

In software development, **recursion** is the practice of having a function call itself. It can have fun, but potentially catastrophic results. Also, it's an invaluable tool in some circumstances.

## Terminology
* Sequential Execution
* Infinite Recursion
* Base Case

## Example
The best example of a practical use of recursion is in generating the `nth` number in the fibonnaci sequence. Remember we generated the first 30 or 40 numbers of this sequence using for loops a couple months ago.

Look at this `int fibonacci(int n)` function, which returns the `nth` number in the fibonacci sequence:

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

The best way to work through recursive code is by picking a small input and tracing out the results by hand. Let's try this by tracing the above fibonacci code with an input of `n = 3`:

1. `int result = fibonacci(3);`
    * Executes the else condition: `return fibonacci(2) + fibonacci(1);`

Because code executes **sequentially**, or in order, we reach the call to `fibonacci(2)` and we have to evaluate the result of that function call before we continue:

2. `fibonacci(2);`
    * Executes the else condition: `return fibonacci(1) + fibonacci(0);`

Now, sequentially we hit this new call to `fibonacci(1)`:

3.  `fibonacci(1)`
    * Executes the first if condition: `return 1;`

This brings us back to our `fibonacci(2)` call from **step 2**, with the returned value of **1** where we used to have the call to `fibonacci(1)`;

4. `fibonacci(2)`
    * Still executing the else condition: `return 1 + fibonacci(0);`
    * Note that we have replaced the first call to `fibonacci(1)` with the returned value from that function: **1**.

We still need to resolve the call to `fibonacci(0)` though.

5. `fibonacci(0)`
    * Executes the else if condition: `return 0;`

This brings us back to our `fibonacci(2)` call from **step 2**, with the returned value of **0** where we used to have the call to `fibonacci(0)`;

6. `fibonacci(2)`
    * Still executing the else condition: `return 1 + 0;`
    * We resolved the `fibonnaci(1)` call in an earlier step. Now we have also resolved the `fibonacci(0)` step.
    * With all our recursive function calls resolved, we return the results of `1 + 0`, or 1. **The nth number in the fibonnaci sequence, where `n = 2`, is 1.**

Now that we've resolved the `fibonacci(2)` function, we trace all the way back to where it was called in **step 1**. We called `fibonacci(2)` inside the return statement for `fibonnaci(3)` and steps 2-6 all resolved that single call, leading us now to **step 7**, which is an updated state of **step 1**:

7. `int result = fibonacci(3);`
    * Originally, this call executed the else statement: `return fibonacci(2) + fibonacci(1)`;
    * Now, with `fibonacci(2)` resolved as **1**, it reads: `return 1 + fibonacci(1);`

Even though we resolved `fibonacci(1)` when it was called as part of the evaluation of `fibonnaci(2)`, our function doesn't fibonacci values anywhere, so we have to resolve the call to `fibonacci(1)` all over again.

8. Resolve **step 3** again, but this time it gets returned up to **step 7**'s call, leading us to step 9:

9. `int result = fibonacci(3)`
    * At step 7 this read as: `return 1 + fibonacci(1);`
    * Now, with `fibonacci(1)` resolved as **1**, it reads: `return 1 + 1`;

And there we have our solution! `fibbonaci(n)` for n = 3 is **2**.

We can easily tell this is correct, because we know the Fibonnaci sequence goes: 0, 1, 1, 2, 3, 5, 8, 13...

If this was an array with index-base 0, it'd be {0,1,1,2,...} and the item at position 3 would be **2**.

That was a lot of work to calculate an easy fibonnaci number! But now that we wrote the function, we can call it for some pretty big numbers (assuming `fibonacci(n)` is not bigger than a 32-bit integer can hold).

If you try calculated `fibonacci(30)` using the recursive function above, you can see how this might be useful.

## Base Cases
Imagine you tried to explain the fibonacci sequence to someone in english.

You'd probably say something like "It's a sequence where every number in the sequence is the sum of the two numbers before it."

Well what if we tried to write that description into a program carelessly? We might end up with something like this:

```Java
    public int fibonacci(int n) {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
```

With this, we're in big trouble. Our fibonacci function will look like the Pooh-bear comic up at the top. This `fibonacci` function will perform **infinite recursion** because we did not guarantee a **base case**.

Let's look back at the correct code:

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

The two if conditions before the final recursive call function as our **base cases**.

To identify these, we need to look at **when we expect the recursion to terminate**. For values `n = 1` and `n = 0` we don't want to continue making recursive calls, because there is no such thing as a -1th or -2th value in the fibonacci sequence. Identifying base cases is similar to identifying boundaries in any loop.

On the AP exam, you may be asked to identify why a recursive function call may or may not work. You should immediately check the function for base cases.

A recursive function without a base case will always result in infinite recursion.

## Practice Exercise

[Exercise](./Exercise.md)