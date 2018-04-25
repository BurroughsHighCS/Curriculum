package school;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    public ArrayList<Course> courses;
    public ArrayList<Grade> grades;
    

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        courses = new ArrayList<Course>();
        grades = new ArrayList<Grade>();        
    }

    public Student(int id) {
        this.id = id;
        this.firstName = "Student";
        this.lastName = "" + id;

        courses = new ArrayList<Course>();
        grades = new ArrayList<Grade>();        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String toString() {
        return "Name: " + getFullName() + " | Id: " + this.id;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public void listCourses() {
        for(Course c : courses) {
            System.out.println(c.toString());
        }
    }

    public void addGrade(Grade g) {
        this.grades.add(g);
    }

    public void listGrades() {
        for(Grade g : grades) {
            System.out.println(g.toString());
        }
    }

    public double getGPA() {
        double gpa = 0;
        for(Grade g : grades) {
            gpa += g.getGradeValue();
        }

        gpa /= grades.size();
        return gpa;
    }
}