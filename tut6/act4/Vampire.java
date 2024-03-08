package tut6.act4;

public class Vampire extends Monster {
    public Vampire(String n) {
        super(n);
    }

    public Vampire(String n, int h) {
        super(n, h);
    }

    public Vampire(String n, int h, int attP) {
        super(n, h, attP);
    }

    public Vampire(String n, int h, int attP, Point2D pos) {
        super(n, h, attP, pos);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is attacking, Damage = " + this.getAttackPower());
    }

    @Override
    public void transform() {
        System.out.println(this.getName() + " is tranforming into a Super Vampire!");
        this.health = this.getHealth() * 7;
        this.raiseAttackPower(this.getAttackPower());
    }

    @Override
    public Point2D teleport(Point2D newPos) {
        System.out.println(this.getName() + " is teleporting to: " + newPos.getX() + ", " + newPos.getY());
        return this.position = newPos;
    }

    @Override
    public void moveUp() {
        this.position.setY(position.getY() + 5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveDown() {
        this.position.setY(position.getY() - 5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveLeft() {
        this.position.setX(position.getX() - 5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveRight() {
        this.position.setX(position.getX() + 5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

}
