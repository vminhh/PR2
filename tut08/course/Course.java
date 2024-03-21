package tut08.course;

import java.util.*;

public class Course implements StudentManageable {
    private String courseID, name;
    private int credits;
    private Department department;
    private Semester semester;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String id, String name, int cre, Department dep, Semester sem) {
        if(!validID(id)){
            throw new IllegalArgumentException("Invalid ID!");
        }

        if(!validCredits(cre)){
            throw new IllegalArgumentException("Out of range 1 - 6.");
        }

        this.courseID = id;
        this.name = name;
        this.credits = cre;
        this.department = dep;
        this.semester = sem;
    }

    // getter
    public String getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public Department getDepartment() {
        return department;
    }

    public Semester getSemester() {
        return semester;
    }

    // setter
    public void setCourseID(String id) {

        this.courseID = id;
    }

    public void setName(String n) {

        this.name = n;
    }

    public void setCredits(int cre) {
        this.credits = cre;
    }

    public void setDepartment(Department dep) {
        this.department = dep;
    }

    public void setSemester(Semester sem) {
        this.semester = sem;
    }

    //
    @Override
    public void addStudent(Student stu) {
        enrolledStudents.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        enrolledStudents.remove(stu);
    }

    @Override
    public void updateStudent(Student oldStu, Student newStu) {
        if (enrolledStudents.indexOf(oldStu) != -1) {
            enrolledStudents.set(enrolledStudents.indexOf(oldStu), newStu);
        }
    }

    @Override
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    /**
     * @Validation
     */

    private boolean validID(String id) {
        return id.matches("^[a-zA-Z0-9]+$");
    }

    private boolean validCredits(int cre) {
        return cre > 0 && cre <= 6;
    }

    // khong biet nen dung 2 cai sau khong
    @SuppressWarnings("unused")
    private boolean validDEP(Department dep) {
        for (Department i : Department.values()) {
            if (i == dep)
                return true;
        }
        return false;
    }

    @SuppressWarnings("unused")
    private boolean validSEM(Semester sem) {
        for (Semester i : Semester.values()) {
            if (i == sem)
                return true;
        }
        return false;
    }

    //...............................
}
