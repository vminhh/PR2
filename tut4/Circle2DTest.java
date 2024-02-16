package tut4;

public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(new Point2D(2, 2), 5.5);
        System.out.println("Area = " + c1.getArea() + "\nPerimeter = " + c1.getPerimeter());
        
        System.out.println("c1 contains A (3, 3) : " + c1.contains(new Point2D(3,3)));        
        System.out.println("c1 contains B (4, 5), r = 10.5 : " + c1.contains(new Circle2D(new Point2D(4, 5), 10.5)));        
        System.out.println("c1 overlaps C (3, 5), r = 2.3 : " + c1.overlaps(new Circle2D(new Point2D(3, 5), 2.3)));

    }

}
