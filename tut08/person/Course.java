package tut08.person;

public class Course {
    private String courseName;
    private String description;

    public Course(String name, String content) {
        this.courseName = name;
        this.description = content;
    }

    // getter
    public String getCourseName() {
        return this.courseName;
    }

    public String getDescription() {
        return this.description;
    }

    // setter
    public void setCourseName(String s) {
        this.courseName = s;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    @Override
    public String toString() {
        return getCourseName() + "-" + getDescription();
    }
}
