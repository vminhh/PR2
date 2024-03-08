package tut6.act4;

public class Main {

    public static void main(String[] args) {
        Goblin g = new Goblin("Green Goblin", 50, 5);
        System.out.println(g);
        g.attack();
        g.transform();
        g.teleport(new Point2D(4, 4));
        System.out.println(g);
        g.moveUp();
        g.moveLeft();
        System.out.println(g + "\n");

        Zombie z = new Zombie("Zombie", 150);
        z.decreseHealth(20);
        z.raiseAttackPower(7);
        z.teleport(new Point2D(2,2));
        z.attack();
        z.transform();
        z.moveRight();
        z.moveDown();
        System.out.println(z +"\n");

        Vampire v = new Vampire("Blade");
        v.decreseHealth(20);
        v.raiseAttackPower(15);
        v.teleport(new Point2D(10,10));
        v.attack();
        v.transform();
        v.moveDown();
        v.moveRight();
        System.out.println(v + "\n");
    }
}
