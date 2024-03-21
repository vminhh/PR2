package tut08.lms;

public class Course {
    private String courseID;
    private String title;
    // .........

    public Course(String id, String t) {
        this.courseID = id;
        this.title = t;
    }

    // getter
    public String getCourseID() {
        return courseID;
    }

    public String getTitle() {
        return title;
    }

    // setter
    public void setCourseID(String id) {
        this.courseID = id;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    @Override
    public String toString() {
        return "Course ID: " + getCourseID() + " - Title: " + getTitle();
    }
    
    // luoi lam validation qua
}
