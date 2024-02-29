package tut5.act1;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(program, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String pro) {
        this.program = pro;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double f) {
        this.fee = f;
    }

    @Override
    public String toString() {
        return "Student [Person [name: " + super.getName() + ", address: " + super.getAddress() + ", program: "
                + getProgram() + ", year: " + getYear() + ", fee: " + getFee() + "]";
    }
}
