package tut6.act1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setColor(Color.Black);
        c.setFilled(true);
        c.setRadius(3.2);
        System.out.println(c);
        System.out.println(String.format("S = %.2f , P = %.2f", c.getArea(), c.getPerimeter()) + "\n");

        Rectangle r = new Rectangle();
        r.setColor(Color.Pink);
        r.setWidth(3.5);
        r.setLength(4.5);
        System.out.println(r);
        System.out.println(String.format("S = %.2f, P = %.2f", r.getArea(), r.getPerimeter()) + "\n");

        Square s = new Square();
        s.setColor(Color.Yellow);
        s.setSide(4.4);
        System.out.println("Use setSide: " + s);
        s.setWidth(2);
        s.setLength(2);
        System.out.println("Use setW and setL: " + s);
        System.out.println(String.format("S = %.2f, P = %.2f", s.getArea(), s.getPerimeter()) + "\n");
    }
}
