package tut6.act1;

public class Circle extends Shape2D {
    protected double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double r) {
        super();
        this.radius = r;
    }

    public Circle(double r, Color c, boolean f) {
        super(c, f, new Point2D());
        this.radius = r;
    }

    public Circle(double r, Color c, boolean f, Point2D p) {
        super(c, f, p);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String toString() {
        return String.format("Circle [Shape [Color = %s, filled = %s], radius = %.1f ], (x,y) = (%.1f,%.1f)",
                super.getColor(), super.isFilled(), getRadius(), super.getPosition().getX(),
                super.getPosition().getY());
    }
}
