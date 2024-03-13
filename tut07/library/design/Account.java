package tut07.library.design;

public class Account {
    private String ID;
    private String password;
    private AccStatus status = AccStatus.Active;
    private Person person;

    public Account() {
    }

    public Account(String id, String pw, AccStatus sta, Person per) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid ID format!");
        }

        if (!validPW(pw)) {
            throw new IllegalArgumentException("Invalid password length!");
        }

        if (!validStatus(sta)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.ID = id;
        this.password = pw;
        this.status = sta;
        this.person = per;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid ID format!");
        }

        this.ID = id;
    }

    public String getPW() {
        return password;
    }

    public void setPW(String pw) {
        if (!validPW(pw)) {
            throw new IllegalArgumentException("Invalid password length!");
        }

        this.password = pw;
    }

    public AccStatus getStatus() {
        return status;
    }

    public void setStatus(AccStatus sta) {
        if (!validStatus(sta)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = sta;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person per) {
        this.person = per;
    }

    public boolean login(String id, String pw) {
        return validID(id) && validPW(pw);
    }

    public void changePW(String newpw) {
        if (validPW(newpw) && !(newpw.equals(getPW()))) {
            throw new IllegalArgumentException("Something went wrong!");
        }

        this.password = newpw;
    }

    /**
     * @Validation
     */
    private boolean validID(String id) {
        return id.matches("^[a-zA-Z0-9]+$");
    }

    private boolean validPW(String pw) {
        return pw.matches("^.{8,}$");
    }

    private boolean validStatus(AccStatus sta) {
        for (AccStatus i : AccStatus.values()) {
            if (sta == i)
                return true;
        }

        return false;
    }
}
