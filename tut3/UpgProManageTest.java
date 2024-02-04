package tut3;

public class UpgProManageTest {
    public static void main(String[] args) {
        UpgProManage goods1 = new UpgProManage("Laptop", 20000, 300);
        goods1.displayDetails();

        UpgProManage goods2 = new UpgProManage("PC", 25000);
        goods2.displayDetails();
    }
}
