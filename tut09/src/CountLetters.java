package tut09.src;

import java.util.*;
import tut09.utils.exceptions.*;

public class CountLetters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            String word = readWord(inp);
            Map<Character, Integer> letterOcurrences = countOcurrences(word);
            displayOccurrences(letterOcurrences);
        } catch (InvalidInputException | WordLengthException e) {
            System.out.println(e.getMessage());
        } finally {
            inp.close();
        }

    }

    private static String readWord(Scanner inp) throws InvalidInputException, WordLengthException {
        System.out.print("Single word without space: ");
        String word = inp.nextLine();

        if (!word.matches("^[a-zA-Z]+$")) {
            throw new InvalidInputException(
                    "Word should consist of only letters, including both uppercase and lowercase characters...");
        }

        if (word.isEmpty() || word.length() > 45) {
            throw new WordLengthException("Word should not be empty, null, or exceed a length of 45 characters....");
        }

        return word;
    }

    private static Map<Character, Integer> countOcurrences(String word) {
        Map<Character, Integer> ocurrences = new HashMap<>();

        for (char c : word.toCharArray()) {
            ocurrences.put(c, ocurrences.getOrDefault(c, 0) + 1);
        }

        return ocurrences;
    }

    private static void displayOccurrences(Map<Character, Integer> occurrences) {
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
