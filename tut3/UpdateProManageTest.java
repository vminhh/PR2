package tut3;

public class UpdateProManageTest {
    public static void main(String[] args) {
        UpdateProManage productWithDiscount = new UpdateProManage ("Laptop", 999.99, 10);

        UpdateProManage  productWithoutDiscount = new UpdateProManage ("Phone", 499.99);

        System.out.println("Product with Discount details:");
        productWithDiscount.displayDetails();

        System.out.println("\nProduct without Discount details:");
        productWithoutDiscount.displayDetails();
    }
}
