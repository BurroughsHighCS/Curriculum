package school;

public class APGrade extends Grade {
    public APGrade(int studentId, String courseId, String grade) {
        super(studentId, courseId, grade);
    }

    @Override
    public double getGradeValue() {
            if(grade == "A")
                return 5;
            else if(grade == "A-")
                return 4.7;
            else if(grade == "B+")
                return 4.4;
            else if(grade == "B")
                return 4;
            else if(grade == "B-")
                return 3.7;
            else if(grade == "C+")
                return 3.4;
            else if(grade == "C")
                return 3;
            else if(grade == "C-")
                return 2.7;
            else if(grade == "D+")
                return 1.4;
            else if(grade == "D")
                return 1;
            else if(grade == "D-")
                return .7;
            else
                return 0;
    }
}