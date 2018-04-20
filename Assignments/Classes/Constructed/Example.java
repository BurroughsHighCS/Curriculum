import school.*;

class Example {
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 1234);
        System.out.println(s.firstName);
        System.out.println(s.lastName);
        System.out.println(s.id);
    }
}