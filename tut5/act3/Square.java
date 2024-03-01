package tut5.act3;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double s) {
        super.setWidth(s);
        super.setLength(s);
    }

    @Override
    public void setWidth(double w) {
        super.setWidth(w);
    }

    @Override
    public void setLength(double l) {
        super.setLength(l);
    }

    @Override
    public String toString() {
        return String.format("Square [Retangle [Shape [color = %s, filled = %s], width = %.2f, length = %.2f]]",
                super.getColor(), super.isFilled(), getSide(), getSide());
    }

    // private boolean isSquare() {
    // return super.getWidth() == super.getLength();
    // }
}
