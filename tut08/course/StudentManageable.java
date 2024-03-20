package tut08.course;

import java.util.*;

public interface StudentManageable {
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(Student student);
    List<Student> getEnrolledStudents();
}
