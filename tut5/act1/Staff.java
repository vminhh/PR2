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
        return String.format("\"Staff [Person [name: %s, address: %s, school: %s, pay: %.1f]", super.getName(),
                super.getAddress(), getSchool(), getPay());

    }
}
