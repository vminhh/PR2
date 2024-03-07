package tut1;

import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("how many eggs? ");
        int e = inp.nextInt();

        int[] rates = { 144, 12, 1 };
        int[] values = new int[3];

        for (int i = 0; i < 3; i++) {
            values[i] = e / rates[i];
            e %= rates[i];
        }

        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d.", values[0], values[1], values[2]);
        inp.close();
    }
}
