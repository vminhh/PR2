package tut08.person;

import java.time.*;
import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        Person test = new Person(110, "Minh", "25/03/2004");
        test.setTel("0985688467");
        test.setEmail("dovanminh253@gmail.com");
        test.setAddress("50/67 Phung Khoang - Nam Tu Liem - Ha Noi.");

        Person test2 = new Person(63, "Mun", "28/10/2004");

        Person test3 = new Person(90, "Aang", "05/12/2003");

        List<Person> persons = new ArrayList<>();
        persons.add(test);
        persons.add(test2);
        persons.add(test3);

        test.displayInfo();
        test2.displayInfo();

        // sort by name
        Comparator<Person> comName = new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.getName().compareToIgnoreCase(b.getName());
            }
        };

        Collections.sort(persons, comName);
        System.out.println("Sort by name");
        for (Person person : persons) {
            System.out.println(person.getName());
        }

        // sort by DOB
        Comparator<Person> comAge = new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                String x = a.getDateOfBirth().replaceAll("[/-]", "");
                String y = b.getDateOfBirth().replaceAll("[/-]", "");

                LocalDate dob1 = LocalDate.of(
                        Integer.parseInt(x.substring(4)),
                        Integer.parseInt(x.substring(2, 4)),
                        Integer.parseInt(x.substring(0, 2)));

                LocalDate dob2 = LocalDate.of(
                        Integer.parseInt(y.substring(4)),
                        Integer.parseInt(y.substring(2, 4)),
                        Integer.parseInt(y.substring(0, 2)));

                return dob1.compareTo(dob2);
            }
        };

        Collections.sort(persons, comAge);
        System.out.println("\nSort by Age");
        for (Person person : persons) {
            System.out.println(person.getName() + " : " + person.getDateOfBirth());
        }
    }
}
