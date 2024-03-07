package tut6.act3;

public class Main {
    public static void main(String[] args) {
        FireMonster f = new FireMonster("Chimera");
        System.out.println("Chimera " + f.attack());

        WaterMonser w = new WaterMonser("Loch Ness Monster");
        System.out.println("Loch Ness Monster " + w.attack());

        StoneMonster s = new StoneMonster("Golem");
        System.out.println("Golem " + s.attack());
    }
    
}
