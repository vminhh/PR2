package tut08.course;

import java.util.*;

public class Student {
    private String studentID, name, dob;

    public Student(String id, String name, String dob) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid id!");
        }

        if(!validName(name)){
            throw new IllegalArgumentException("Invalid name!")
        }
        
        if(!validDOB(dob)){
            throw new IllegalArgumentException("Date format : dd/mm/yyyy or dd-mm-yyyy");
        }

        this.studentID = id;
        this.name=name;
        this.dob=dob;
    }

    // getter
    public String getID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    // setter ............?
    public void setID(String id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid id!");
        }

        this.studentID = id;
    }

    public void setName(String n){

        if(!validName(name)){
            throw new IllegalArgumentException("Invalid name!")
        }
        
       this.name=n;
    }

    public void setDOB(String dob) {
        if (!validDOB(dob)) {
            throw new IllegalArgumentException("Date format : dd/mm/yyyy or dd-mm-yyyy");
        }

        this.dob = dob;
    }

    @Override
    public String toString() {
        return "id: " + getID() + "\nName: " + getName() + "\nDOB: " + getDOB() + "\n";
    }

    /*
     * @Validation
     */

    private boolean validID(String id) {
        return id.matches("^[0-9]+${50}");
    }

    private boolean validName(String n) {
        return n.matches("^[a-zA-Z\\'.\\s']+$");
    }

    private boolean validDOB(String dob) {
        return dob.matches("^(0[1-9]|[12][0-9]|3[01])([/-])(0[1-9]|1[0-2])([/-])((19|20)\\d{2})$");
    }

}
