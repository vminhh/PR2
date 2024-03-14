package tut07.library;

public class Account {
    private String ID;
    private String password;
    private AccountStatus status = AccountStatus.Active;
    private Person person;

    public Account() {
    }

    public Account(String id, String pw, AccountStatus sta, Person per) {
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

    // getter

    public String getID() {
        return ID;
    }

    public String getPW() {
        return password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    // setter

    public void setID(String id) {
        if (!validID(id)) {
            throw new IllegalArgumentException("Invalid ID format!");
        }

        this.ID = id;
    }

    public void setPW(String pw) {
        if (!validPW(pw)) {
            throw new IllegalArgumentException("Invalid password length!");
        }

        this.password = pw;
    }

    public void setStatus(AccountStatus sta) {
        if (!validStatus(sta)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = sta;
    }

    public void setPerson(Person per) {
        this.person = per;
    }

    // other methods

    public boolean login(String id, String pw) {
        return validID(id) && validPW(pw);
    }

    public void changePW(String newpw) {
        if (validPW(newpw) && !(newpw.equals(getPW()))) {
            throw new IllegalArgumentException("Something went wrong!");
        }

        this.password = newpw;
    }

    public void updateAccountStatus(AccountStatus newStatus) {
        if (!validStatus(newStatus)) {
            throw new IllegalArgumentException("Invalid status!");
        }

        this.status = newStatus;
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

    private boolean validStatus(AccountStatus sta) {
        for (AccountStatus i : AccountStatus.values()) {
            if (sta == i)
                return true;
        }

        return false;
    }
}
