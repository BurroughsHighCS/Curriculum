# Constructed Classes
We talked about static classes first, but in actual practice, static classes are much more rare than their alternative: **constructed classes**, or just plain **classes**.

## Examples and Explanation
A static class is a class that does not need to be constructed. Another way to think of it is that a static class is a class that does not require any specific context. Take Java's `Math` class, for example. We have used it a couple times because it provides valuable utility functions:
```Java
    int exponent = Math.pow(2, 4);
    //exponent == 2 to the power of 4 == 16
```

Compare that to the `Scanner` class that we were using for earlier projects:

```Java
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
```

We can't just call `Scanner.nextLine()` because Scanner is not a static class. Scanner _needs context_ to work. We've only ever used Scanners on user input from the terminal, but they can actually read a lot of other things, like `.txt` (plain text) files. In our case, we wanted the scanner to read from the user's input in the terminal, so we provide that context to the user by passing `System.in` (The terminal input) into its **constructor**.

## Constructors
Let's look at constructors. Specifically, let's try making a `Student` class.

```Java
    public class Student {
        public String firstName;
        public String lastName;
        public int id;
    }
```

Ok, we have a student class. We expect a Student to have a first name, a last name, and a student id, but we need to be able to pass that information to the student object.

To do that, we add a constructor.

```Java
    package school;

    public class Student {
        public String firstName;
        public String lastName;
        public int id;

        public Student(String firstName, String lastName, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }
    }
```

Some notes on this constructor:
* The constructor is a **function**. It can have parameters to set up the initial state of the object.
    * The function does not declare a return type. No `void`, no `int`, nothing.
        * Technically, the constructor _does_ return something. A `Student` constructor returns an object of type `Student`.
    * The name of the constructor function _must be the exact name of the class_.
        * If the class is called `Student`, the constructor name must be `Student(...)` with the exact character cases matching. `student(...)` is not allowed, nor is _any other name_.

Now that we have a Student constructor, let's look at how we would call it in another class:

```Java
    import school.Student;

    public class Example {
        public static void main(String[] args){
            Student s = new Student("John", "Doe", 1234);

            System.out.println(s.firstName);
            System.out.println(s.lastName);
            System.out.println(s.id);
        }
    }
```

We have to import the `Student` class. We do this by adding `import <packageName>.Student;` at the top of our file. The `Student` class must declare its package name at the top of its file as `package <packageName>;`.

In our, case, the package name is `school`, so we use `import school.Student;` and `package school;`
* The `Student.java` file must also be in a folder with a name _exactly_ matching its package name. So in this case the `Student.java` should be in a folder named `student`.
    * Our `Example` class should NOT be in that same folder. It should be in a folder one level above the `school` folder.

## Exercises

### [Exercise 1](./Exercise1.md)
