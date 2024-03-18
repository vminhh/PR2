package tut08.person;

public class Main {
    public static void main(String[] args) {
        Person test = new Person(110,"Minh","25/03/2004");

        test.setTel("0985688467");
        test.setEmail("dovanminh253@gmail.com");
        test.setAddress("50/67 Phung Khoang - Nam Tu Liem - Ha Noi.");

        test.displayInfo();
    }
}
