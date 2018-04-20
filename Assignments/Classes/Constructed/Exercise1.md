# Constructed Classes Exercise #1
1. Using the java code provided in this assignment folder, add the function `String getFullName()` to the `Student` class. `getFullName()` should return the student's first and last name as a single string.
    * For example, for `Student s = new Student("John", "Doe", 1234);`, `s.getFullName()` should return the string "John Doe".

2. Add the function `String toString()` to the `Student` class. `toString()` should return all of the details of the student in a single string.
    * For example, for `Student s = new Student("John", "Doe", 1234);`, `s.toString()` should return the string "Name: John Doe; Id: 1234".

3. Add a `Course` class to the `school` package. A `Course` should have the following properties:
    * `String courseName`
    * `String courseId`
    * `String teacherName`
    * `String room`
    * The `Course` class should also have the appropriate constructor to populate a `Course` object with these 4 pieces of information.

4. Add the function `String toString()` to the `Course` class. `toString()` should return all of the details of the course in a single string.
    * For example, for `Course c = new Course("Computer Science", "CS101", "Mr. Merrell", "L39B");`, `c.toString()` should return the string "Course: Computer Science; ID: CS101; Teacher: Mr. Merrell; Room: L39B".

5. Add a `List<Course> courses` data variable to the `Student` class. Write an `void addCourse(Course c)` function to the `Student` class that will add objects of type `Course` to a student's list of enrolled courses.

6. Add a `void listCourses()` function to the `Student` class that prints the `toString()` representation of each course a student is enrolled in to the terminal.

7. To verify that everything works correctly, create a `Student` and enroll your student in 4 Courses by adding 4 `Course` objects using the `addCourse()` function you wrote in part 4. Then list those 4 courses by calling your student's `listCourses()` function.
