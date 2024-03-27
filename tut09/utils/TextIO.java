package tut09.utils;

import java.util.*;
import tut09.utils.exceptions.*;

/**
 * Class facilitate user input from the keyboard
 */
public class TextIO {
    private static final Scanner inp = new Scanner(System.in);

    /**
     * get an integer from user
     * 
     * @return integer entered by user
     * @throws NotPossibleException if input is a invalid integer
     */
    public static int getInt() throws NotPossibleException {
        try {
            return inp.nextInt();

        } catch (InputMismatchException e) {
            // clear input
            inp.next();
            throw new NotPossibleException("Not an integer...");
        }
    }

    /** */
    public static float getFloat() throws NotPossibleException {
        try {
            return inp.nextFloat();

        } catch (InputMismatchException e) {
            inp.next();
            throw new NotPossibleException("Not a float.");
        }
    }

    /**
     * get a word (non-whitespace) from the user
     * 
     * @return word entered by user
     */
    public static String getWord() {
        return inp.next();
    }

    public static String getEmail() throws NotPossibleException {
        String email = inp.next();
        
        if (validEmail(email)) {
            throw new NotPossibleException("Invalid email format....");
        }

        return email;
    }

    private static boolean validEmail(String e) {
        return e.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.]+\\[a-zA-Z]{2,}");
    }
}
