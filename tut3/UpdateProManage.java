package tut3;

import java.util.Scanner;

public class UpdateProManage {
    private String productName;
    private double productPrice;
    private int productQuantity;
    private double discount;

    public UpdateProManage (String productName, double productPrice, double discount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.discount = discount;
    }

    public UpdateProManage (String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.discount = 0;
    }

    public void promptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        this.productName = scanner.nextLine();

        while (true) {
            System.out.println("Enter product price:");
            try {
                this.productPrice = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value for price.");
            }
        }

        while (true) {
            System.out.println("Enter product quantity:");
            try {
                this.productQuantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric value for quantity.");
            }
        }
        scanner.close();
    }

    public void displayDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Price: $" + this.productPrice);
        System.out.println("Product Quantity: " + this.productQuantity);
        System.out.println("Discount: " + this.discount + "%");
    }
}
