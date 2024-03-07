package tut6.act1;

public class Rectangle extends Shape2D {
    protected double length = 1.0;
    protected double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public Rectangle(double l, double w, Color c, boolean f) {
        super(c, f, new Point2D());
        this.length = l;
        this.width = w;
    }

    public Rectangle(double l, double w, Color c, boolean f, Point2D p) {
        super(c, f, p);
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        return String.format(
                "Rectagle [Shape [Color = %s, filled = %s], width = %.1f, length = %.1f], (x,y) = (%.1f,%.1f)",
                super.getColor(), super.isFilled(), getWidth(), getLength(), super.getPosition().getX(),
                super.getPosition().getY());
    }
}
