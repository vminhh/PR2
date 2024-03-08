package tut6.act4;

public class Goblin extends Monster {
    public Goblin(String n) {
        super(n);
    }

    public Goblin(String n, int h) {
        super(n, h);
    }

    public Goblin(String n, int h, int attP) {
        super(n, h, attP);
    }

    public Goblin(String n, int h, int attP, Point2D pos) {
        super(n, h, attP, pos);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is attacking, Damage = " + this.getAttackPower());
    }

    @Override
    public void transform() {
        System.out.println(this.getName() + " is tranforming into a Super Goblin!");
        this.health = this.getHealth() * 5;
        this.raiseAttackPower(this.getAttackPower());
    }

    @Override
    public Point2D teleport(Point2D newPos) {
        System.out.println(this.getName() + " is teleporting to: " + newPos.getX() + ", " + newPos.getY());
        return this.position = newPos;
    }

    @Override
    public void moveUp() {
        this.position.setY(position.getY() + 1.5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveDown() {
        this.position.setY(position.getY() - 1.5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveLeft() {
        this.position.setX(position.getX() - 1.5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

    @Override
    public void moveRight() {
        this.position.setX(position.getX() + 1.5);
        System.out.println(this.getName() + " moved up to position: " + position.getX() + ", " + position.getY());
    }

}
