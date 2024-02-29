package tut5.act1;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
        this.address = add;
    }

    @Override
    public String toString() {
        return "Person [name: " + getName() + ", address: " + getAddress() + "]";
    }
}
