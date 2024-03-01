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
        this.color = isColor(c.toLowerCase()) ? c : null;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }

    @Override
    public String toString() {
        return String.format("Shape [Color = %s, filled = %s ]", getColor(), isFilled());
    }

    private boolean isColor(String c) {
        return c.matches("^(red|orange|yellow|green|blue|purple|pink|gray|white|black|grown)$");
    }
}
