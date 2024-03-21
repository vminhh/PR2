package tut08.lms;

import java.util.*;
import java.time.*;

public class LearningManagementSystem {
    private Map<Integer, Student> students;
    private Map<Integer, Course> courses;
    private int studentIDCounter = 0;
    private int courseIDCounter = 0;
    private String currentSeason;
    private int currentYear;

    public LearningManagementSystem() {
        this.students = new HashMap<>();
        this.courses = new HashMap<>();
        setSeasonAndYear();
    }

    // ...
    public Map<Integer, Student> getStudent() {
        return students;
    }

    public Map<Integer, Course> getCourse() {
        return courses;
    }

    // other method
    // add
    public void addStudent(String name, String dob) {
        String id = generateStudentID();
        Student newStudent = new Student(id, name, dob);
        students.put(studentIDCounter, newStudent);
    }

    public void addCourse(String title) {
        String id = generateCourseID();
        Course newCourse = new Course(id, title);
        courses.put(courseIDCounter, newCourse);
    }

    // remove
    public void removeStudent(int id) {
        students.remove(id);
    }

    public void removeCourse(int id) {
        courses.remove(id);
    }

    // search
    public List<Integer> findStudentsByName(String name) {
        List<Integer> foundStudents = new ArrayList<>();
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                foundStudents.add(entry.getKey());
            }
        }
        return foundStudents;
    }

    public List<Integer> findCoursesByTitle(String title) {
        List<Integer> foundCourses = new ArrayList<>();
        for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
            if (entry.getValue().getTitle().equals(title)) {
                foundCourses.add(entry.getKey());
            }
        }
        return foundCourses;
    }

    // get then diplay
    public List<Student> getSortedStudents() {
        List<Student> sortedStudents = new ArrayList<>(students.values());
        Collections.sort(sortedStudents, Comparator.comparing(Student::getName));
        return sortedStudents;
    }

    public List<Course> getSortedCourses() {
        List<Course> sortedCourses = new ArrayList<>(courses.values());
        Collections.sort(sortedCourses, Comparator.comparing(Course::getTitle));
        return sortedCourses;
    }

    // helper method
    // set current season and year
    private void setSeasonAndYear() {
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();

        switch (month) {
            case 1:
            case 2:
            case 3:
                currentSeason = "SP";
                break;
            case 4:
            case 5:
            case 6:
                currentSeason = "SU";
                break;
            case 7:
            case 8:
            case 9:
                currentSeason = "AU";
            default:
                currentSeason = "WI";
                break;
        }
        currentYear = currentDate.getYear();
    }

    // generate ID
    private String generateStudentID() {
        return currentSeason + currentYear + "S" + (++studentIDCounter);
    }

    private String generateCourseID() {
        return currentSeason + currentYear + "C" + (++courseIDCounter);
    }
}
