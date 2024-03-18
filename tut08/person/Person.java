package tut08.person;

public class Person {
    private int id;
    private String name, dateOfBirth, email, tel, address;

    public Person() {
    }

    public Person(int id, String name, String dob) {
        if (!validID(id)) {
            throw new IllegalArgumentException("ID must be larger than 0.");
        }

        if (!validName(name)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (!validDate(dob)) {
            throw new IllegalArgumentException("Date format dd/mm/yyyy or dd-mm-yyyy");
        }

        this.id = id;
        this.name = name;
        this.dateOfBirth = dob;
        this.email = null;
        this.tel = null;
        this.address = null;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    // setter

    public void setName(String n) {
        if (!validName(n)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        this.name = n;
    }

    public void setEmail(String e) {
        if (!validEmail(e)) {
            throw new IllegalArgumentException("Email format example@example.com");
        }

        this.email = e;
    }

    public void setTel(String t) {
        if (!validTel(t)) {
            throw new IllegalArgumentException("Phone number has at 10 numbers.");
        }

        this.tel = t;
    }

    public void setAddress(String a) {
        if (!validAddress(a)) {
            throw new IllegalArgumentException("Invalid address!");
        }

        this.address = a;
    }

    // .............
    public void setId(int id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("ID must be larger than 0.");
        }

        this.id = id;
    }

    public void setDateOfBirth(String d) {

        if (!validDate(d)) {
            throw new IllegalArgumentException("Date format dd/mm/yyyy or dd-mm-yyyy");
        }

        this.dateOfBirth = d;
    }

    public void displayInfo() {
        System.out.println("\tInformation\t");
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Date of Birth : " + getDateOfBirth());
        System.out.println("Email : " + getEmail());
        System.out.println("Tel : " + getTel());
        System.out.println("Address : " + getAddress());
        System.out.println();

    }

    /**
     * @Validation
     */

    public boolean validID(int id) {
        return id > 0;
    }

    public boolean validName(String n) {
        return n.matches("^[a-zA-Z\\s]+${50}");
    }

    public boolean validDate(String d) {
        return d.matches("^(0[1-9]|[12][0-9]|3[01])([/-])(0[1-9]|1[0-2])([/-])((19|20)\\d{2})$");
    }

    public boolean validEmail(String e) {
        return e.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]{2,}");
    }

    public boolean validTel(String t) {
        return t.matches("\\d{10}$");
    }

    public boolean validAddress(String a) {
        return a.matches("^[a-zA-Z0-9._/\\s-]+$");
    }
}
