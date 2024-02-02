package tut2;

public class DiceRollPreview{
    public static void main (String[] args){
        int a = (int) (Math.random()* 6) + 1;
        System.out.println("The first die comes up " + a);

        int b = (int) (Math.random() * 6) + 1;
        System.out.println("The second die comes up " +b);

        System.out.println("Your total roll is " + (a+b));
    }
}