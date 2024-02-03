package tut3;

public class ProManageTest {
    public static void main(String[] args) {
        System.out.println("Product 1");
        ProManage goods1 = new ProManage();
        goods1.promtDetails();
        goods1.displayDetails();
        goods1.closeScanner();
    }
}
