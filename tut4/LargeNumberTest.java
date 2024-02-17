package tut4;

public class LargeNumberTest {
    public static void main(String[] args) {
        LargeNumber c = new LargeNumber("123456789123456");
        LargeNumber d = new LargeNumber("-123456187123127");

        System.out.println("Number 1 = " + c.getNumber());
        System.out.println("Number 2 = " + d.getNumber());

        System.out.println("Sum = " + c.add(d));
        System.out.println("Diff = " + c.sub(d));
        System.out.println("Prod = " + c.times(d));
        System.out.println("Quot = " + c.div(d));       
    }
}
