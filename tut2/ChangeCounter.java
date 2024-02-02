package tut2;

import java.util.*;

public class ChangeCounter {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("how many quarters? ");
        int quarters = inp.nextInt();

        System.out.print("how many dimes? ");
        int dimes = inp.nextInt();

        System.out.print("how many nickels? ");
        int nickels = inp.nextInt();

        System.out.print("how many pennies? ");
        int pennies = inp.nextInt();

        System.out.printf("You have $%.2f",(double) (quarters * 0.25 + dimes * 0.1 + nickels * 0.05 + pennies * 0.01));
        inp.close();
    }
}

 /* 
    Penny = 1 cent, 1/100th of a dollar, $0.01. 
    Nickel = 5 cents, 1/20th of a dollar, $0.05. 
    Dime = 10 cents, 1/10th of a dollar, $0.10.
    Quarter = 25 cents, 1/4th of a dollar, $0.25. 
*/