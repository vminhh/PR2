package tut08.course;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // initialize
        Course course1 = new Course("61ESP1B2", "B2 Practicing", 6, Department.ESPD, Semester.Fall);
        Course course2 = new Course("61FIT2PR2", "Programing 2", 3, Department.FIT, Semester.Spring);
        Course course3 = new Course("61FIT2DSA", "Data Structer and Algorithm", 3, Department.FIT, Semester.Spring);
        // add more .............

        Student test1 = new Student("110", "Minh", "25/03/2004");
        Student test2 = new Student("63", "Mun", "28/10/2004");
        // add more .........

        // add stu
        course1.addStudent(test2);
        course2.addStudent(test1);
        course2.addStudent(test2);
        course3.addStudent(test1);
        course3.addStudent(test2);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

        // initialize list course
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        // sort by name
        Comparator<Course> comName = new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return a.getName().compareToIgnoreCase(b.getName());
            }
        };

        Collections.sort(courses, comName);
        System.out.println("Sort by name");
        for (Course course : courses) {
            System.out.println(course.getName());
        }

        // sort by credit
        Comparator<Course> comCredits = new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return Integer.compare(a.getCredits(), b.getCredits());
            }
        };

        Collections.sort(courses, comCredits);
        System.out.println("\nSort by credits");
        for (Course course : courses) {
            System.out.println(course.getName() + " - " + course.getCredits() + " credits");
        }

        // sort by department
        Comparator<Course> comDEP = new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return a.getDepartment().compareTo(b.getDepartment());
            }
        };

        Collections.sort(courses, comDEP);
        System.out.println("\nSort by Department");
        for (Course course : courses) {
            System.out.println(course.getName() + " - " + course.getDepartment());
        }

        // sort by semester
        Comparator<Course> comSEM = new Comparator<Course>() {
            @Override
            public int compare(Course a, Course b) {
                return a.getSemester().compareTo(b.getSemester());
            }
        };

        Collections.sort(courses, comSEM);
        System.out.println("\nSort by Semester");
        for (Course course : courses) {
            System.out.println(course.getName() + " - " + course.getSemester());
        }
    }
}
