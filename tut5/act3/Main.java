package tut5.act3;

public class Main {
    public static void main(String[] args) {
        Shape origin = new Shape();
        System.out.println(origin);
        origin.setColor("yellow");
        origin.setFilled(false);
        System.out.println("After set attributes: " + origin + "\n");

        Circle c = new Circle();
        System.out.println(c);
        // c.setColor("blue");
        // c.setFilled(false);
        c.setRadius(3.2);
        System.out.println("After set radius: " + c);
        System.out.println(String.format("S = %.2f , P = %.2f", c.getArea(), c.getPerimeter()) + "\n");

        Rectangle r = new Rectangle();
        System.out.println(r);
        r.setWidth(3.5);
        r.setLength(4.5);
        System.out.println("After set sides: " + r);
        System.out.println(String.format("S = %.2f, P = %.2f", r.getArea(), r.getPerimeter()) + "\n");

        Square s = new Square();
        System.out.println(s);
        s.setSide(4.4);
        System.out.println("Use setSide: " + s);
        s.setWidth(2);
        s.setLength(2);
        System.out.println("Use setW and setL: " + s + "\n");
    }
}
