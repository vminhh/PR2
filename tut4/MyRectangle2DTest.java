package tut4;

import java.awt.geom.Point2D;

public class MyRectangle2DTest {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area = " + r1.getArea() + "\nPerimeter = " + r1.getPerimeter());

        System.out.println("r1.contains(new Point2D(3,3)): " + r1.contains(new Point2D.Double(3, 3)));
        System.out.println(
                "r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)): " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(
                "r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
