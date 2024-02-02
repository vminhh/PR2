package tut1;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner inp =new Scanner (System.in);

        System.out.print("What's your name? ");
        String name = inp.nextLine().toUpperCase();

        System.out.println(String.format("Hello, %s, nice to meet you!", name));
        inp.close();
    }
}
