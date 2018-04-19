package school;

import java.util.*;

public class Student {
    public String firstName;
    public String lastName;
    public int id;
    public int gradYear;
    public double gpa;
    public int grade;
    public List<Course> courses;

    public Student(String firstName, String lastName, int id, int gradYear, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradYear = gradYear;
        this.grade = grade;

        courses = new ArrayList<Course>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void listCourses() {
        for(Course c : courses) {
            System.out.println(c.toString());
        }
    }
}