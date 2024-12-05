/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.io.*;
import java.util.Scanner;

public class Ads {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");

        System.out.println("Enter the name of an input file: ");
        String inputFileName = scanner.nextLine();

        String[] lines = input(inputFileName);

        System.out.println("Enter the name of an output file: ");
        String outputFileName = scanner.nextLine();
        System.out.println("Printing the contents of your ad in " + outputFileName);

        output(lines, outputFileName);

        scanner.close();
    }

    /**
     * Purpose: Take all user input and then store it in a array to pass it on 
     * @param String fileName - user's desired file name
     * @return The string array populated with the ad content 
     */
    public static String[] input(String fileName) throws IOException {
        final int FIXED_LENGTH = 5;
        final int FIRST_INDEX = 0;
        final int SECOND_INDEX = 1;
        final int THIRD_INDEX = 2;
        final int FOURTH_INDEX = 3;
        final int FIFTH_INDEX = 4;
        
        String[] lines = new String[FIXED_LENGTH];

        File inputFile = new File(fileName);
        Scanner input = new Scanner(inputFile);

        lines[FIRST_INDEX] = input.nextLine();
        lines[SECOND_INDEX] = input.nextLine();
        lines[THIRD_INDEX] = input.nextLine();
        lines[FOURTH_INDEX] = input.nextLine();
        lines[FIFTH_INDEX] = input.nextLine();

        input.close();

        return lines;
    }

    /**
     * Purpose: Access all user input string from the array and then print it
     * @param String fileName - user's desired file name
     * @param String[] line - String array where we previously stored all of our user input in to from Input
     * @return void
     */
    public static void output(String[] lines, String fileName) throws IOException {
        File outputFile = new File(fileName);
        PrintWriter out = new PrintWriter(outputFile);

        final int FIRST_INDEX = 0;
        final int SECOND_INDEX = 1;
        final int THIRD_INDEX = 2;
        final int FOURTH_INDEX = 3;
        final int FIFTH_INDEX = 4;

        String title = lines[FIRST_INDEX].toUpperCase(); 
        out.println("***" + title + "***" + "\n");
        out.println("   " + lines[SECOND_INDEX]);
        out.println("     " + lines[THIRD_INDEX]);
        out.println("   " + lines[FOURTH_INDEX]);
        out.println("     " + lines[FIFTH_INDEX]);

        out.close();
    }
}
o