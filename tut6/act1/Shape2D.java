package tut6.act1;

public abstract class Shape2D implements Shape2DCalculation {
    protected Color color = Color.White;
    protected boolean filled = false;
    protected Point2D position = new Point2D();

    public Shape2D() {
    }

    public Shape2D(Point2D pos) {
        this.position = pos;
    }

    public Shape2D(Color c, boolean f, Point2D pos) {
        this.color = c;
        this.filled = f;
        this.position = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean isFilled) {
        this.filled = isFilled;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D newP) {
        this.position = newP;
    }

    @Override
    public String toString() {
        return String.format("Shape [Color = %s, filled = %b, (x,y) = (%.1f,%.1f) ]", getColor(), isFilled(),
                getPosition().getX(), getPosition().getY());
    }
}
