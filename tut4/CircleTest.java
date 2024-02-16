package tut4;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "lue");
        System.out.println(
                "\tCircle 1:\nRadius = " + c1.getRadius() + "\nColor: " + c1.getColor() + "\nArea = " + c1.getArea());

        Circle c2 = new Circle(2.0, "red");
        System.out.println(
                "\tCircle 2:\nRadius = " + c2.getRadius() + "\nColor: " + c2.getColor() + "\nArea = " + c2.getArea());

        Circle c3 = new Circle(1.0, "blue");
        System.out.println(
                "\tCircle 3:\nRadius = " + c3.getRadius() + "\nColor: " + c3.getColor() + "\nArea = " + c3.getArea());

        /* 
        Circle test1 = new Circle(-1, "red");
        System.out.println("\tCircle test1:\nRadius = " + test1.getRadius() + "\nColor: " + test1.getColor()
                + "\nArea = " + test1.getArea());

        Circle test2 = new Circle(2, "nonono");
        System.out.println("\tCircle test2:\nRadius = " + test2.getRadius() + "\nColor: " + test2.getColor()
                + "\nArea = " + test2.getArea());

        Circle test3 = new Circle(2, "yElloW");
        System.out.println("\tCircle test2:\nRadius = " + test3.getRadius() + "\nColor: " + test3.getColor()
                + "\nArea = " + test3.getArea());
        */
    }
}
