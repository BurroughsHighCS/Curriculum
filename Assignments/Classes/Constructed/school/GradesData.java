package school;

import java.util.ArrayList;

public class GradesData {
    public static ArrayList<Grade> getGradesData() {
        ArrayList<Grade> grades = new ArrayList<Grade>();

        grades.add(new APGrade(1, "CS101", "A"));
        grades.add(new APGrade(2, "CS101", "B-"));
        grades.add(new APGrade(3, "CS101", "B+"));
        grades.add(new APGrade(4, "CS101", "C"));
        grades.add(new APGrade(5, "CS101", "D"));
        grades.add(new APGrade(6, "CS101", "C-"));
        grades.add(new APGrade(7, "CS101", "B"));
        grades.add(new APGrade(8, "CS101", "A-"));
        grades.add(new APGrade(9, "CS101", "C+"));
        grades.add(new APGrade(10, "CS101", "B"));
        grades.add(new APGrade(1, "BIO101", "B"));
        grades.add(new APGrade(2, "BIO101", "C+"));
        grades.add(new APGrade(3, "BIO101", "A"));
        grades.add(new APGrade(4, "BIO101", "A"));
        grades.add(new APGrade(5, "BIO101", "C-"));
        grades.add(new APGrade(6, "BIO101", "B"));
        grades.add(new APGrade(7, "BIO101", "A"));
        grades.add(new APGrade(8, "BIO101", "A-"));
        grades.add(new APGrade(9, "BIO101", "C+"));
        grades.add(new APGrade(10, "BIO101", "B-"));
        grades.add(new Grade(1, "CS124", "B+"));
        grades.add(new Grade(2, "CS124", "B+"));
        grades.add(new Grade(3, "CS124", "A"));
        grades.add(new Grade(4, "CS124", "C-"));
        grades.add(new Grade(5, "CS124", "D+"));
        grades.add(new Grade(6, "CS124", "C+"));
        grades.add(new Grade(7, "CS124", "B+"));
        grades.add(new Grade(8, "CS124", "B-"));
        grades.add(new Grade(9, "CS124", "A-"));
        grades.add(new Grade(10, "CS124", "A-"));
        grades.add(new Grade(1, "DRAW101", "A"));
        grades.add(new Grade(2, "DRAW101", "B"));
        grades.add(new Grade(3, "DRAW101", "A"));
        grades.add(new Grade(4, "DRAW101", "B+"));
        grades.add(new Grade(5, "DRAW101", "A-"));
        grades.add(new Grade(6, "DRAW101", "C+"));
        grades.add(new Grade(7, "DRAW101", "A"));
        grades.add(new Grade(8, "DRAW101", "A-"));
        grades.add(new Grade(9, "DRAW101", "A"));
        grades.add(new Grade(10, "DRAW101", "B+"));
        grades.add(new Grade(1, "ENGL101", "C+"));
        grades.add(new Grade(2, "ENGL101", "B"));
        grades.add(new Grade(3, "ENGL101", "D+"));
        grades.add(new Grade(4, "ENGL101", "C+"));
        grades.add(new Grade(5, "ENGL101", "D-"));
        grades.add(new Grade(6, "ENGL101", "A"));
        grades.add(new Grade(7, "ENGL101", "B+"));
        grades.add(new Grade(8, "ENGL101", "A-"));
        grades.add(new Grade(9, "ENGL101", "B"));
        grades.add(new Grade(10, "ENGL101", "B-"));

        return grades;
    }
}