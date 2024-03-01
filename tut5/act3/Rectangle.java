package tut5.act3;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * getWidth() * getLength();
    }

    @Override
    public String toString() {
        return String.format("Rectagle [Shape [Color = %s, filled = %s], width = %.2f, length = %.2f]",
                super.getColor(), super.isFilled(), getWidth(), getLength());
    }
}
