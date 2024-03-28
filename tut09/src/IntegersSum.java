package tut09.src;

import java.util.*;
import tut09.utils.exceptions.*;

public class IntegersSum {
    public static void main(String[] args) throws InputMismatchException, EmptyLineException {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Enter number and stop by 0: ");
            System.out.println("Sum = " + getSum(inp));

        } catch (InputMismatchException e) {
            throw new InputMismatchException(
                    " Must input a sequence of integers separated by single spaces, including both positive and negative numbers...");

        } catch (NoSuchElementException e) {
            throw new EmptyLineException("Please provide sequence of integers");

        } finally {
            inp.close();
        }
    }

    private static int getSum(Scanner inp) throws InputMismatchException, EmptyLineException {
        int sum = 0;
        while (true) {
            try {
                int num = inp.nextInt();

                if (num == 0) {
                    break;
                }

                sum += num;

            } catch (InputMismatchException e) {
                inp.next();
                throw e;

            } catch (NoSuchElementException e) {
                throw new EmptyLineException("The input can not be empty");
            }
        }

        if (sum == 0) {
            throw new EmptyLineException("Please provide sequence of integers");
        }

        return sum;
    }

}
