package tut4;

public class Rectangle {
    private float length, width;

    public Rectangle() {
    }

    public Rectangle(float l, float w) {
        this.length = isValidNum(l) ? l : 0.0f;
        this.width = isValidNum(w) ? w : 0.0f;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float l) {
        this.length = l;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    public String toString() {
        return "Rectangle[length = " + getLength() +  ", width = " + getWidth() + "]";
    }

    private boolean isValidNum(float n) {
        return n > 0.0f;
    }
}
