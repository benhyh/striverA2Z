/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int number;
        int words;
        int commas;
        boolean program = true;

        while (program) {
            System.out.println("Enter a sentence or x to exit: \n");
            sentence = input.nextLine();

            number = 0;
            words = 0;
            commas = 0;

            if (sentence.equalsIgnoreCase("x")) {
                program = false;
                System.out.println("Goodbye!");
            } else {
                for (int i = 0; i < sentence.length(); i++) {
                    char currentChar = sentence.charAt(i);

                    if (currentChar >= '0' && currentChar <= '9') {
                        number++;
                    }

                    if (currentChar == ',') {
                        commas++;
                    }

                    int previous = i - 1;

                    if (currentChar != ' ' && currentChar != ',' && currentChar != '\t') {
                        // Start of string or preceded by a space, tab, or comma
                        if (i == 0 || sentence.charAt(i - 1) == ' ' || 
                            sentence.charAt(i - 1) == '\t' || sentence.charAt(i - 1) == ',') {
                            words++;
                        }
                    }
                }

                System.out.println("**Sentence Summary:**\n");
                System.out.println("Total numbers: " + number);
                System.out.println("Total words: " + words);
                System.out.println("Total commas: " + commas);

                if (number > 0 && commas > 0) {
                    System.out.println("Contains both numbers and commas");
                }

                System.out.println();
            }
        }

        input.close();
    }
}





















