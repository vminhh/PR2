package tut3;

// import java.util.*;

public class UpgProManage {
    private String name;
    private double price, discount;
    // private Scanner inp;
    
    public UpgProManage(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        // inp = new Scanner(System.in);
    }

    public UpgProManage(String name, double price) {
        this(name, price, 0);
    }

    private double calculateImportTax(double price) {
        return price * 0.1;
    }

    public void displayDetails() {
        System.out.println(this.toString());
    }

    /*
    public void promtDetails() {
        this.name = promtName();
        this.price = promtPri();
        this.discount = promtDis();
    }

    private String promtName() {
        boolean test = false;
        String proName;

        do {
            System.out.print("Enter product name: ");
            proName = inp.nextLine();

            if (proName.matches(".*\\d.*")) {
                System.out.print("Enter the valid name: ");
            } else {
                test = true;
            }
        } while (!test);

        return proName;
    }

    private double promtPri() {
        double price;

        do {
            System.out.print("Enter product price: ");

            while (!inp.hasNextDouble()) {
                System.out.print("Enter the number: ");
                inp.next();
            }

            price = inp.nextDouble();

            if (price < 0)
                System.out.print("Price must be greater than 0 !");
        } while (price < 0);

        return price;
    }

    private double promtDis() {
        double discount;

        do {
            System.out.print("Enter product discount: ");

            while (!inp.hasNextDouble()) {
                System.out.print("Enter the number: ");
                inp.next();
            }

            discount = inp.nextDouble();

            if (discount < 0 || discount > 100) {
                System.out.print("Discount must be between 0 and 500 !");
            }
        } while (discount < 0 || discount > 500);

        return discount;
    }

    public void closeScanner() {
        inp.close();
    }
    */

    public String toString() {
        return "Product: [name: " + this.name + ", price: " + this.price + ", discount: " + this.discount
                + ", tax: " + this.calculateImportTax(price) + "]";
    }
}
