package tut1;

public class Interest {
    public static void main(String[] args) {
        double principal;
        double rate;
        double interest;

        principal = 17000.0;
        rate = 0.07;
        interest = principal * rate;
        principal = principal + interest;

        System.out.print("The interest earned is ");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is ");
        System.out.println(principal);
    }
}

/*
 * a. The program will still work without any issue
 * Because because the double data type is capable of holding decimal values
 * And Java can able to perform implicit type conversion from double to double
 */

/*
 * b. It will result in a compilation error
 * Beacause the int data type cannot hold decimal values
 * We can use explicit type casting to convert double value to int: int
 * principal = (int) 17000.0;
 */