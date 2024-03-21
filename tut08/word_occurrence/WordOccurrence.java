package tut08.word_occurrence;

import java.io.*;
import java.util.*;

public class WordOccurrence {
    public static void main(String[] args) {
        String inpFile = "tut08\\word_occurrence\\input.txt";
        String optFile = "tut08\\word_occurrence\\output.txt";

        Map<String, Integer> wordCount = countWord(inpFile);
        writeWord(optFile, wordCount);
    }

    // counter ocurrence of word
    private static Map<String, Integer> countWord(String inputFile) {
        Map<String, Integer> wordCount = new TreeMap<>();

        try (BufferedReader rd = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = rd.readLine()) != null) {
                String[] words = line.split("\\s+");

                // remove punctuation, convert to lowercase
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // check then put number of occurences
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    // write to ocurrences of word into ouput.txt
    private static void writeWord(String ouputFile, Map<String, Integer> wordCount) {
        try (PrintWriter pwr = new PrintWriter(new File(ouputFile))) {
            // get occurences of words then covert to Int Stream and sum them
            int totalWord = wordCount.values().stream().mapToInt(Integer::intValue).sum();
            pwr.println(totalWord);

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                pwr.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("Completed. Please check your output file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // helper method
    /*
    private static boolean fileExists(String fileName) {
        File f = new File(fileName);
        return f.exists() && f.isDirectory();
    }
    */
}
