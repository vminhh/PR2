package tut6.act1;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, Color c, boolean f) {
        super(side, side, c, f);
    }

    public Square(double side, Color c, boolean f, Point2D p) {
        super(side, side, c, f, p);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double s) {
        super.setWidth(s);
        super.setLength(s);
    }

    @Override
    public void setWidth(double s) {
        super.setWidth(s);
    }

    @Override
    public void setLength(double s) {
        super.setLength(s);
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return String.format("Square [Retangle [Shape [color = %s, filled = %s], width = %.1f, length = %.1f]]",
                super.getColor(), super.isFilled(), getSide(), getSide());
    }
}
