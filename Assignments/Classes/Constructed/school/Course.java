package school;

public class Course {
    public String courseName;
    public String courseId;
    public String teacherName;
    public String room;

    public Course(String courseName, String courseId, String teacherName, String room) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teacherName = teacherName;
        this.room = room;
    }

    public Course(String courseId) {
        this.courseId = courseId;
        this.courseName = "NA";
        this.teacherName = "NA";
        this.room = "NA";
    }

    public String toString() {
        return "Name: " + this.courseName 
                + " | Id: " + this.courseId 
                + " | Teacher: " + this.teacherName 
                + " | Room: " + this.room;
    }
}