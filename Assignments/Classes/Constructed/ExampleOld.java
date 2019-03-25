import school.*;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Grade> gradesDB = GradesData.getGradesData();

        Student[] students = new Student[10];
        for(int i = 1; i <= 10; i++) {
            students[i-1] = new Student(i);
        }

        for(Grade g : gradesDB) {
            
            students[g.getStudentId() - 1].addGrade(g);
        }

        for(Student s : students) {
            System.out.println(s.getFullName() + " : " + s.getGPA());
        }
    }
}