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
        this.courseID = id;
        this.name = name;
        this.description = des;
        this.credit = cre;
    }

    public int getCourseID() {
        if (!validID(courseID)) {
            throw new IllegalArgumentException("Invald course ID!");
        }

        return courseID;
    }

    public void setCourseID(int id) {
        this.courseID = id;
    }

    public String getName() {
        if (!validName(name)) {
            throw new IllegalArgumentException("Invalid course name");
        }

        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getDescription() {
        if (!validDescription(description)) {
            throw new IllegalArgumentException("Content overflow!");
        }

        return description;
    }

    public void setDecription(String des) {
        this.description = des;
    }

    public int getCredit() {
        if (!validCredit(credit)) {
            throw new IllegalArgumentException("Invalid credits!");
        }

        return credit;
    }

    public void setCredit(int cre) {
        this.credit = cre;
    }

    public List<String> getAcademicTranscript() {
        return acacdemicTranscript;
    }

    public void setAcademicTranscript(List<String> content) {
        this.acacdemicTranscript = content;
    }

    public void displayCourse() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Credits: " + getCredit());
    }

    /**
     * @ValidationData
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
