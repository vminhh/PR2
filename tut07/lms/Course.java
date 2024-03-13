package tut07.lms;

import java.util.*;

public class Course {
    private int courseID;
    private String name;
    private String description;
    private int credit;
    private List<String> acacdemicTranscript;

    public Course() {
    }

    public Course(int id, String name, String des, int cre) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invald course ID!");
        }

        if (!validName(name)) {
            throw new IllegalArgumentException("Invalid course name!");
        }

        if (!validDescription(des)) {
            throw new IllegalArgumentException("Content overflow!");
        }

        if (!validCredit(cre)) {
            throw new IllegalArgumentException("Invalid credits!");
        }

        this.courseID = id;
        this.name = name;
        this.description = des;
        this.credit = cre;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invald course ID!");
        }

        this.courseID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (!validName(n)) {
            throw new IllegalArgumentException("Invalid course name!");
        }

        this.name = n;
    }

    public String getDescription() {
        return description;
    }

    public void setDecription(String des) {
        if (!validDescription(des)) {
            throw new IllegalArgumentException("Content overflow!");
        }

        this.description = des;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int cre) {
        if (!validCredit(cre)) {
            throw new IllegalArgumentException("Invalid credits!");
        }

        this.credit = cre;
    }

    public List<String> getAcademicTranscript() {
        return acacdemicTranscript;
    }

    public void setAcademicTranscript(List<String> content) {
        this.acacdemicTranscript = content;
    }

    public void displayCourse() {
        System.out.println("\tCourse Information\t");
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Credits: " + getCredit());
        System.out.println("\n");
    }

    /**
     * @Validation
     */
    private boolean validID(int id) {
        return id > 1;
    }

    private boolean validName(String name) {
        return name.length() <= 100;
    }

    private boolean validCredit(int credit) {
        return credit >= 1 && credit <= 10;
    }

    private boolean validDescription(String content) {
        return content.length() <= 500;
    }
}
