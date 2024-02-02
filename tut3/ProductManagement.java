package tut3;

import java.util.*;

class ProductManage {
    private String productName;
    private double productPrice;
    private int productQuantity;

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
    }
}

