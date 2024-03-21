package tut08.person;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        // initialize
        Student test = new Student(110, "Minh", "25/03/2004", "0110", 2.5);
        Student test2 = new Student(63, "Mun", "28/10/2004", "0063", 2.7);
        Student test3 = new Student(100, "Mark", "05/11/2003", "0097", 2.1);

        Course course1 = new Course("PR2", "OOP");
        Course course2 = new Course("DSA", "Tree Part");
        Course course3 = new Course("IIS", "Cryptography");

        // add course
        test.addEnrolledCourse(course1);
        test.addEnrolledCourse(course2);
        System.out.println(test);

        test2.addEnrolledCourse(course2);
        test2.addEnrolledCourse(course3);
        System.out.println(test2);

        test3.addEnrolledCourse(course1);
        System.out.println(test3);

        // ...
        List<Student> students = new ArrayList<>();
        students.add(test3);
        students.add(test2);
        students.add(test);

        // sort by gpa
        Comparator<Student> comGPA = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Double.compare(a.getGPA(), b.getGPA());
            }
        };

        Collections.sort(students, comGPA);
        System.out.println("Sort by GPA");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA = " + student.getGPA());
        }

    }
}
