package tut4;

class Point2D {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}

public class Circle2D {
    private Point2D center;
    private double radius;

    public Circle2D() {
        this(new Point2D(0, 0), 1);
    }

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 6.28 * getRadius();
    }

    public boolean contains(Point2D point) {
        return this.radius > 
                Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    public boolean contains(Circle2D circle) {
        return this.radius > Math.sqrt(Math.pow(circle.getCenter().getX() - center.getX(), 2)
                + Math.pow(circle.getCenter().getY() - center.getY(), 2)) + circle.getRadius();
    }

    public boolean overlaps(Circle2D circle) {
        return this.radius > Math.sqrt(Math.pow(circle.getCenter().getX() - center.getX(), 2)
                + Math.pow(circle.getCenter().getY() - center.getY(), 2)) + circle.getRadius();
    }
}