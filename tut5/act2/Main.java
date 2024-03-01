package tut5.act2;

public class Main {
    public static void main(String[] args) {
        Point A = new Point(1.1f, 1.2f);
        System.out.println("A " + A);
        System.out.println();

        Point B = new Point();
        System.out.println("B " + B);
        B.setXY(2.1f, 2.2f);
        System.out.println("After set coordinates for B, B " + B);
        System.out.println();

        MovablePoint C = new MovablePoint(3.1f, 3.2f, 1.1f, 1.2f);
        System.out.println("C " + C);
        System.out.println("After C move: C " + C.move());
        System.out.println();
        
        MovablePoint D = new MovablePoint();
        System.out.println("D " + D);
        D.setX(4.1f);
        D.setY(4.2f);
        D.setSpeed(2.1f, 2.2f);
        System.out.println("After set coordinates and speeds for D, D " + D);
        System.out.println("After D move: D " + D.move());
    }
}
