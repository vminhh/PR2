package tut07.library.design;

public class Person {
    private String name;
    private String phone;

    public Person(String name, String phone) {
        if (!validName(name)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (!validPhone(phone)) {
            throw new IllegalArgumentException("Invalid phone number!");
        }
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (!validName(n)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        this.name = n;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String p) {
        if (!validPhone(p)) {
            throw new IllegalArgumentException("Invalid phone number!");
        }

        this.phone = p;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, address: %s", getName(), getPhone());
    }

    private boolean validName(String n) {
        return n.matches("^[a-zA-Z\\s]+$");
    }

    private boolean validPhone(String num) {
        return num.matches("^[0-9]+$");
    }
}