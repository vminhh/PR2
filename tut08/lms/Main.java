package tut08.lms;

public class Main {
    public static void main(String[] args) {
        // initilize
        LearningManagementSystem test = new LearningManagementSystem();

        // add stu
        test.addStudent("Minh", "25/03/2004");
        test.addStudent("Mun", "28/10/2004");

        // add course
        test.addCourse("PR2");
        test.addCourse("DSA");
        test.addCourse("CNE");

        // display
        System.out.println("Students");
        for (Student student : test.getSortedStudents()) {
            System.out.println(student);
        }

        System.out.println("\nCourses");
        for (Course course : test.getSortedCourses()) {
            System.out.println(course);
        }

        // search by name
        String searchName = "Minh";
        System.out.println("\nSearching for student: " + searchName);
        for (Integer id : test.findStudentsByName(searchName)) {
            System.out.println("Found student with ID: " + id);
        }

        // remove
        int studentIDRemoved = 1; // Assuming the first student added has ID 1
        System.out.println("\nRemoving student with ID: " + studentIDRemoved);
        test.removeStudent(studentIDRemoved);

        // diplay remaining
        System.out.println("\nRemaining Students");
        for (Student student : test.getSortedStudents()) {
            System.out.println(student);
        }
    }
}

