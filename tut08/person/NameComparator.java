package tut08.person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }

}
