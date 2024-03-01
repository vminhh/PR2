package tut5.act5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter sth: ");
        String text = inp.nextLine();

        System.out.print("Enter Shift key: ");
        int key = inp.nextInt();

        CeaserCipher cipher = new CeaserCipher(text, key);
        cipher.encrypt();
        System.out.println("Encrypt: " + cipher.getCipherText());
        cipher.decrypt();
        System.out.println("Decrypt: " + cipher.getPlainText());

        inp.close();
    }
}
