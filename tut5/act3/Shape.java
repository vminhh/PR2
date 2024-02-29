package tut5.act3;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }

    @Override
    public String toString() {
        return "Shape [color = " + getColor() + ", filled = " + isFilled() + "]";
    }
}
