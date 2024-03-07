package tut6.act2;

public class MovablePoint extends Point implements Movable {
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSp, float ySp) {
        this.xSpeed = xSp;
        this.ySpeed = ySp;
    }

    public MovablePoint(float x, float y, float xSp, float ySp) {
        super(x, y);
        this.xSpeed = xSp;
        this.ySpeed = ySp;
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
        this.ySpeed = ySp;
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

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
