package tut07.library;

public class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        if (!validName(name)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (!validPhone(phone)) {
            throw new IllegalArgumentException("Invalid phone number!");
        }

        if (!validEmail(email)) {
            throw new IllegalArgumentException("Email format : example@gmail.com");
        }

        this.name = name;
        this.phone = phone;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void getEmail(String e) {
        if (!validEmail(e)) {
            throw new IllegalArgumentException("Email format : example@gmail.com");
        }

        this.email = e;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, address: %s", getName(), getPhone());
    }

    /**
     * @Validation
     */

    private boolean validName(String n) {
        return n.matches("^[a-zA-Z\\s]+$");
    }

    private boolean validPhone(String num) {
        return num.matches("^[0-9]+$");
    }

    private boolean validEmail(String e) {
        return e.matches("\\w+@\\w+\\.\\w+");
    }
}