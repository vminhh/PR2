package tut4;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = isRadius(r) ? r : 0.0;
    }

    public Circle(double r, String c) {
        this.radius = isRadius(r) ? r : 0.0;
        this.color = isColor(c.toLowerCase()) ? c.toLowerCase() : null;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    private boolean isColor(String c) {
        return c.matches("^(red|orange|yellow|green|blue|purple|pink|gray|while|black|grown)$");
    }

    private boolean isRadius(double r) {
        return r > 0.0;
    }
}
