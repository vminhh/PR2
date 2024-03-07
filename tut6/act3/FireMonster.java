package tut6.act3;

public class FireMonster extends Monster {
    protected String name;

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Fireeeeeeee";
    }
}
