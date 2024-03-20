package tut08.person;

import java.util.*;

public class Student extends Person {
    private String studentID;
    private double gpa;
    private List<Course> enrolledCourse = new ArrayList<>();;

    public Student(int id, String name, String dob, String stdID, double gpa) {
        super(id, name, dob);

        if (!validID(stdID)) {
            throw new IllegalArgumentException("Invalid id!");
        }

        if (!validGPA(gpa)) {
            throw new IllegalArgumentException("GPA ranges in 0 - 4");
        }

        this.studentID = stdID;
        this.gpa = gpa;
    }

    // getter
    public String getID() {
        return studentID;
    }

    public double getGPA() {
        return gpa;
    }

    public List<Course> getEnrolledCourse() {
        return enrolledCourse;
    }

    // setter
    public void setID(String id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid id!");
        }

        this.studentID = id;
    }

    public void setGPA(double gpa) {
        if (!validGPA(gpa)) {
            throw new IllegalArgumentException("GPA ranges in 0 - 4");
        }

        this.gpa = gpa;
    }

    public void addEnrolledCourse(Course c) {
        this.enrolledCourse.add(c);
    }

    @Override
    public String toString() {
        return "id: " + super.getId() + "\nName: " + super.getName() + "\nDOB: " + super.getDateOfBirth()
                + "\nStudent ID: " + getID() + "\nGPA: " + getGPA() + "\nList course: " + getEnrolledCourse() +"\n";
    }

    /*
     * @Validation
     */

    private boolean validID(String id) {
        return id.matches("^[0-9]+${50}");
    }

    private boolean validGPA(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }
}
