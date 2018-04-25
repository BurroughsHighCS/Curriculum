package school;

public class Grade {
    public int studentId;
    public String courseId;
    public String grade;

    public Grade(int studentId, String courseId, String grade) {
        this.grade = grade;
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getGrade() {
        return grade;
    }

    public String toString() {
        return "Student ID: " + studentId + " | Course ID: " + courseId + " | Grade: " + grade;
    }

    public double getGradeValue() {
            if(grade == "A")
                return 4;
            else if(grade == "A-")
                return 3.7;
            else if(grade == "B+")
                return 3.4;
            else if(grade == "B")
                return 3;
            else if(grade == "B-")
                return 2.7;
            else if(grade == "C+")
                return 2.4;
            else if(grade == "C")
                return 2;
            else if(grade == "C-")
                return 1.7;
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