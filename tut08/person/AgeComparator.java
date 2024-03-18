package tut08.person;

import java.time.LocalDate;
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        LocalDate dob1 = LocalDate.of(
                Integer.parseInt(a.getDateOfBirth().substring(4)),
                Integer.parseInt(a.getDateOfBirth().substring(2, 4)),
                Integer.parseInt(a.getDateOfBirth().substring(0, 2)));

        // mai lam tiep vay
    }

}
