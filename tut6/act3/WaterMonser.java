package tut6.act3;

public class WaterMonser extends Monster {
    protected String name;

    public WaterMonser(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Waterrrrrrrrrr";
    }
}
