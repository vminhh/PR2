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
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return "Rectangle[length = " + this.length +  ", width = " + this.width + "]";
    }

    private boolean isValidNum(float n) {
        return n > 0.0f;
    }
}
