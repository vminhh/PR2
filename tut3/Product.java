package tut3;

public class Product {
    String name;
    double price, discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double calculateImportTax(){
        return price * (10.0/100);
    }

    public void displayDetails(){
        System.out.println("\tProduct");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("Tax: $" + calculateImportTax());
        System.out.println("Total Price: $" + (price - discount + calculateImportTax()));
    }
}
