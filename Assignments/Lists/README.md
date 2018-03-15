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

    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);

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

### Appending Data

