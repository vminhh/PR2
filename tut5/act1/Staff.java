package tut5.act1;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String sch) {
        this.school = sch;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double p) {
        this.pay = p;
    }

    @Override
    public String toString() {
        return "Staff [Person [name: " + super.getName() + ", address: " + super.getAddress() + ", school: "
                + getSchool() + ", pay: " + getPay() + "]";
    }
}
