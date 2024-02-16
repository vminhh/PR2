package tut4;

import java.awt.geom.Point2D;

public class MyRectangle2D {
    private Point2D center;
    private double width, height;

    public MyRectangle2D() {
        this.center = new Point2D.Double(0, 0);
        this.height = this.width = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.center = new Point2D.Double(x, y);
        this.width = width;
        this.height = height;
    }

    public Point2D getCenter() {
        return this.center;
    }

    public void setCenter(double x, double y) {
        this.center.setLocation(x, y);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean contains(Point2D p) {
        double x1 = center.getX() - getWidth() / 2;
        double x2 = center.getX() + getWidth() / 2;
        double y1 = center.getY() - getHeight() / 2;
        double y2 = center.getY() + getHeight() / 2;
        return x1 < p.getX() && p.getX() < x2 && y1 < p.getY() && p.getY() < y2;
    }

    public boolean contains(MyRectangle2D r) {
        double x1 = center.getX() - getWidth() / 2;
        double x2 = center.getX() + getWidth() / 2;
        double y1 = center.getY() - getHeight() / 2;
        double y2 = center.getY() + getHeight() / 2;

        double rx1 = r.getCenter().getX() - r.getWidth() / 2;
        double rx2 = r.getCenter().getX() + r.getWidth() / 2;
        double ry1 = r.getCenter().getY() - r.getHeight() / 2;
        double ry2 = r.getCenter().getY() + r.getHeight() / 2;

        return x1 <= rx1 && rx2 <= x2 && y1 <= ry1 && ry2 <= y2;
    }

    public boolean overlaps(MyRectangle2D r) {
        double x1 = center.getX() - getWidth() / 2;
        double x2 = center.getX() + getWidth() / 2;
        double y1 = center.getY() - getHeight() / 2;
        double y2 = center.getY() + getHeight() / 2;

        double rx1 = r.getCenter().getX() - r.getWidth() / 2;
        double rx2 = r.getCenter().getX() + r.getWidth() / 2;
        double ry1 = r.getCenter().getY() - r.getHeight() / 2;
        double ry2 = r.getCenter().getY() + r.getHeight() / 2;

        return x1 < rx2 && rx1 < x2 && y1 < ry2 && ry1 < y2;
    }
}
