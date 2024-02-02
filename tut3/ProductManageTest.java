package tut3;

public class ProductManageTest {
        public static void main(String[] args) {

            ProductManage product1 = new ProductManage();
            ProductManage product2 = new ProductManage();
    
            System.out.println("Enter details for Product 1:");
            product1.promptDetails();
    
            System.out.println("\nEnter details for Product 2:");
            product2.promptDetails();
    
            System.out.println("\nProduct 1 details:");
            product1.displayDetails();
    
            System.out.println("\nProduct 2 details:");
            product2.displayDetails();
        }
}
