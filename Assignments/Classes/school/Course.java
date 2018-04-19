package school;

public class Course {
    public String courseName;
    public String teacherName;
    public String courseID;
    public String room;

    public Course() {
        this.courseName = "";
        this.teacherName = "";
        this.courseID = "";
        this.room = "";
    }

    public Course(String courseName, String teacherName, String courseID, String room) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseID = courseID;
        this.room = room;
    }

    public String toString() {
        return this.courseName + ", " + this.teacherName + ", " + this.courseID + ", " + this.room;
    }
}