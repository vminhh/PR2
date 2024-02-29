package tut5.act1;

public class act1Test {
    public static void main(String[] args) {
        Person person = new Person("Minh", "Ha Nam");
        Student stu = new Student("minh", "ha nam", "it", 2, 14680000);
        Staff sta = new Staff("hmmm", "hmmm", "hanu", 0);

        System.out.println(person);
        System.out.println(stu);
        System.out.println(sta);
    }
}
