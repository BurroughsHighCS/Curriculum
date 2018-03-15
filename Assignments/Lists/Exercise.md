# Lists Exercise
1. What are the contents of the list after all the operations performed in the code below (Don't use a for loop to figure it out. Write the expected contents in a comment.)

```java
    ArrayList<Integer> numList = new ArrayList<Integer>();

    numList.add(5);
    numList.add(0,10);
    numList.add(1,15);
    numList.remove(1);
    numList.add(20);
    numList.add(1,25);
    numList.add(0, 30);
    numList.add(3, 35);
    numList.remove(2);
```

2. Make a Todo list app that allows a user to enter and remove items from a todo list freely. 

Hints:
* You will need to be able to:
    1. List the users todoitems.
        * Each todo item should display its index (so the user knows which items to remove):
        ```
            [0] Finish Plinko
            [1] Finish Lists Assignment
            [2] Tell Mr. Merrell he's awesome
        ```
    2. Add a todo item.
    3. Remove a todo item (using its index).

* You will need to use a scanner's ```nextLine()``` function to read their todoList inputs.
* You will need to use a scanner's ```hasNextInt()``` and ```nextInt()``` functions to read items to be removed.