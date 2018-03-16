# Lists
Arrays give us the power to store a **collection** of data in a single variable. We have learned some of the power that gives us in simplifying code. Arrays still have a single key weakness:

Once declared, an Array _cannot_ be resized.

Assume we were writing a todo list application where the user has the choice to add and subtract todo items at will. We don't know how many items the user will add to their list. We might assume that a user will never enter more than 100 items onto their todo list and create a ```int[] todos = new int[100]``` to store them all.

But we have to make that assumption, and we will end up with an Array that will likely have a bunch of empty values in it.

With Lists, we don't have to make assumptions. We can declare a list that will start at size 0 and grow or shrink as the user adds and removes items.

## Terminology
* Collection - Arrays and Lists are both _collections_ of data. They collect several pieces of data into a single variable which allows us to access them using an index. There are many other types of collections that we may cover later in the class.
* List
* ArrayList
* Add
* Append
* Insert
* Remove

## List Basics
Java has several different kinds of Lists. For the purposes of this class, we should only ever need to use one of them called the **ArrayList**. Don't worry about the distinction too much. Underneath the hood, Java uses Arrays to create ArrayLists, but we never have to worry about that. We can use it without understanding what happens underneath the hood.

Let's take a basic usage of a simple Array:

```Java
    int[] numArray = {1,2,3,4,5};

    for(int i = 0; i < numArray.length; i++) {
        System.out.println(nums[i]);
    }
```

We can recreate this same code using an ArrayList.

```Java
    ArrayList<Integer> numList = new ArrayList<Integer>();

    numList.add(1);
    numList.add(2);
    numList.add(3);
    numList.add(4);
    numList.add(5);

    for(int i = 0; i < numList.size(); i++) {
        System.out.println(numList.get(i));
    }
```

Note some of the changes:
* First, we can't initialize our data using the ```{1,2,3,4,5}``` syntax.
    * Our List begins at size 0, and each time we call ```nums.add(someNumber)``` we **grow** the list.
* Second, we can't use ```int``` for our integer data type. We have to use a different version of integer in Java called ```Integer```: ```ArrayList<Integer> numList = new ArrayList<Integer>()```. numList is an ArrayList _of type **Integer**_.
    * ```Integer``` is functionally equivalent to ```int```. Don't worry about the difference. Just remember to use ```Integer``` for lists.
    * If you would prefer. You can just use ```Integer``` for everything from now on. It will work for everything that ```int``` can do.
* Third, instead of using ```numArray.length``` as the upper bound of our for loop, we use ```numList.size()```. Lists don't have a _length_ property. They have a _size_ **function**.
    * While _size_ is a function, it just returns the number of items in the array. ```numList.size()``` will return 5 just like ```numArray.length``` returned 5.
    * There are a few reasons for the difference, but don't worry about them too much. For now just try to remember the difference.
* Finally, instead of reading a number using the ```numArray[i]``` syntax, we call a function to do the same thing ```numList.get(i)```.
    * ```numList[i]``` should still work in most cases, but the ```numList.get(i)``` function for lists works better overall.

## Use Cases
Let's summarize some of the use cases, and the syntax for them:

### Appending Data
To **append** data to a list means to add it _at the end of the list_. This operation uses the List's ```add()``` function:

```Java
    ArrayList<Integer> numList = new ArrayList<Integer>(); // [] (An Empty List)
    numList.add(1); // [1]
    numList.add(10); // [1, 10]
    numList.add(100); // [1, 10, 100]

    //Works for other data types, too
    ArrayList<String> strList = new ArrayList<String>(); // []
    strList.add("Hello"); // ["Hello"]
    strList.add("World"); // ["Hello", "World"]
```

An **append** operation using the ```add()``` function will grow the the size of the list by 1 by adding the data supplied into a new position at the end of the list.

### Inserting Data
An **Insert** operation, on the other hand, can add data to any existing position in the list. This is still considered an **add** operation, so it still uses the ```add()``` function.

```Java
    ArrayList<Integer> numList = new ArrayList<Integer>(); // [] (An Empty List)

    // APPENDS
    numList.add(1); // [1]
    numList.add(10); // [1, 10]
    numList.add(100); // [1, 10, 100]

    // INSERTS
    // Insert the value 5 at position 1:
    numList.add(1, 5); // [1, 5, 10, 100]

    // Insert the value 1 at position 1:
    numList.add(1, 1); // [1, 1, 5, 10, 100]
```

Note two things:
1. The ```add()``` function takes two parameters for an insertion:
    * **An insertion index**: Where we want to add the data.
    * **An insertion value**: What data we want to add at the chosen index.
2. We inserted twice at index 1. Each time, the value we inserted pushed the rest of the data back 1 position. **Data can move to different indexes in a list.** Anytime we perform an **insert** or **remove** operation, segments of the list are likely to shift right or left by 1 index.

### Removing Data
A **remove** operation uses the ```remove()``` function:

```Java
    ArrayList<Integer> numList = new ArrayList<Integer>(); // [] (An Empty List)

    // APPENDS
    numList.add(1); // [1]
    numList.add(10); // [1, 10]
    numList.add(100); // [1, 10, 100]

    // INSERTS
    numList.add(1, 5); // [1, 5, 10, 100]
    numList.add(1, 1); // [1, 1, 5, 10, 100]

    // REMOVES
    //Remove the item AT position 0
    numList.remove(0) // [1, 5, 10, 100]

    //Remove the item AT position 0 (again)
    numList.remove(0) // [5, 10, 100]

    //Remove the item AT position 1
    numList.remove(1) // [5, 100]
```

The ```remove()``` function takes an **index** as a parameter. You provide the index you want removed from the List, and it will remove whatever data was stored at that position in the list.

Note again that remaining items in the list are prone to change positions when you insert or remove data from the middle of the list.

## Assignment [Exercise](./Exercise.md)
You should be prepared to try the Lists [exercise](./Exercise.md) now.

