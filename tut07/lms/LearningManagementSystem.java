package tut07.lms;

public class LearningManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(110, "Minh", "25/03/2004", 2.0);
        Course course1 = new Course(100, "PR2", "Design Studuent Management System", 5);

        student1.enrollInCourse(course1);
        student1.displayStudent();
        course1.displayCourse();
    }
}
