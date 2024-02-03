package tut3;

public class Product {
    private String name;
    private double price, discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double calculateImportTax() {
        return price * 0.1;
    }

    public void displayDetails() {
        System.out.println("\tProduct");
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Discount: $" + this.discount);
        System.out.println("Tax: $" + calculateImportTax());
        System.out.println("Total Price: $" + (this.price - this.discount + calculateImportTax()));
    }

    public void promtDetails() {
        this.name = promtName(name);
        this.price = promtPositive(price);
        this.discount = promtPositive(discount);
    }

    public boolean setName(String newName) {
        if (this.name.matches("^[a-zA-Z0-9 ]*$")) {
            this.name = newName;
            return true;
        } else
            return false;
    }

    public boolean setNumber(double n) {
        return n > 0;
    }

    private String promtName(String name) {
        return setName(name) ? name : null;
    }

    private double promtPositive(double n) {
        return setNumber(n) ? n : 0.0;
    }
}
