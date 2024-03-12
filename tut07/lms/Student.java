package tut07.lms;

import java.util.*;

public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private List<Course> erolledCourse = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String name, String birth, double gpa) {
        this.studentID = id;
        this.name = name;
        this.dateOfBirth = birth;
        this.gpa = gpa;
    }

    public int getStudentID() {
        if (!validID(studentID)) {
            throw new IllegalArgumentException("Invalid StduentID!");
        }

        return studentID;
    }

    public void setStudentID(int id) {
        this.studentID = id;
    }

    public String getName() {
        if (!validName(name)) {
            throw new IllegalArgumentException("INvalid name!");
        }

        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getDateOfBirth() {
        if (!validDate(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date!");
        }

        return dateOfBirth;
    }

    public void setDateOfBirth(String date) {
        this.dateOfBirth = date;
    }

    public double getGPA() {
        if (!validGPA(gpa)) {
            throw new IllegalArgumentException("Invalid GPA!");
        }

        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public List<Course> getErolledCourse() {
        return erolledCourse;
    }

    public void enrollInCourse(Course course){
        erolledCourse.add(course);
    }

    public double calculateGPA(){
        return 0.0;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Name: " + getName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("GPA: " + getGPA() );
        System.out.print("Enrolled Courses: ");
        for (Course course : getErolledCourse()) {
            System.out.print(course.getName() + " ");
        }
        System.out.println();
    }

    /**
     * @ValidationData
     */
    private boolean validID(int id) {
        return id >= 1;
    }

    private boolean validName(String name) {
        return name.length() <= 50;
    }

    private boolean validDate(String date) {
        return date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
    }

    private boolean validGPA(double gpa) {
        return gpa >= 0.0 && gpa <= 10.0;
    }

}
