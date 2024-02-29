package tut5.act2;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSp) {
        this.xSpeed = xSp;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySp) {
        this.xSpeed = ySp;
    }

    public void setSpeed(float xSp, float ySp) {
        setXSpeed(xSp);
        setYSpeed(ySp);
    }

    public float[] getSpeed() {
        return new float[] { getXSpeed(), getYSpeed() };
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")" + ", speed = (" + getXSpeed() + "," + getYSpeed() + ")";
    }

    public MovablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
