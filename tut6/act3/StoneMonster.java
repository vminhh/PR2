package tut6.act3;

public class StoneMonster extends Monster {
    protected String name;

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Stoneeeeeeee";
    }
}
