package tut6.act4;

public abstract class Monster implements SpecialAbility, MovablePoint {
    protected String name;
    protected int health = 100;
    protected int attackPower = 1;
    Point2D position = new Point2D();

    public Monster() {
    }

    public Monster(String n) {
        this.name = n;
    }

    public Monster(String n, int h) {
        this(n);
        this.health = h;
    }

    public Monster(String n, int h, int attP) {
        this(n, h);
        this.attackPower = attP;
    }

    public Monster(String n, int h, int attP, Point2D pos) {
        this(n, h, attP);
        this.position = pos;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getHealth() {
        return health;
    }

    public void decreseHealth(int amt) {
        this.health -= amt;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void raiseAttackPower(int amt) {
        this.attackPower *= amt;
    }

    abstract void attack();

    @Override
    public String toString() {
        return String.format("Name: %s, Hp: %d, Damage: %d, Position: %.1f,%.1f", getName(), getHealth(),
                getAttackPower(), position.getX(), position.getY());
    }

}
