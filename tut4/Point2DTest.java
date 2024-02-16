package tut4;

import java.util.*;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = inp.nextDouble();
        double y1 = inp.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = inp.nextDouble();
        double y2 = inp.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));

        inp.close();
    }
}
