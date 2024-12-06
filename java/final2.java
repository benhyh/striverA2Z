/**
* @author Ben Huynh
* CIS 36A
*/

import java.io.*;
import java.util.Scanner;

public class Handles {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Input 
        System.out.println("Enter the input file name: ");
        String inputName = scanner.nextLine();

        File inputFile = new File(inputName);
        Scanner inputScanner = new Scanner(inputFile);

        int size = inputScanner.nextInt();
        inputScanner.nextLine();

        String[] namesArray = new String[size];
        String[] handlesArray = new String[size];

        for (int i = 0; i < size; i++) {
            namesArray[i] = inputScanner.nextLine();
            handlesArray[i] = inputScanner.nextLine();
        }

        handlesArray = convertHandleToURL(handlesArray);

        // Output
        System.out.println("Enter the output file name: ");
        String outputName = scanner.nextLine();

        printInFile(namesArray, handlesArray, outputName);

        System.out.println("Reading the " + inputName + " file containing " + size + " handles.");
        System.out.println("Open " + outputName + " to view names and urls for all " + size +  " accounts");

        inputScanner.close();
        scanner.close();
    }

    /**
     * Purpose: Convert handle to URL
     * @param array of Strings
     * @return array of Strings containing the URLs for each accountq
     */

    public static String[] convertHandleToURL (String[] handlesArray) {
        int size = handlesArray.length;
        String [] urlArray = new String[size];

        for (int i = 0; i < size; i++) {
            handlesArray[i] = handlesArray[i].substring(1, handlesArray[i].length());                 
        }
        
        for (int i = 0; i < size; i++) {
            urlArray[i] = "www.instagram.com/" + handlesArray[i];
        }

        return urlArray;
    }


    /**
     * Purpose to print first and last name followed by the @ handles
     * @param name
     * @param String[] namesArray
     * @param String[] handles Array
     * @return nothing
     */

    public static void printInFile(String[] namesArray, String[] handlesArray, String name) throws IOException {
        File output = new File(name);
        PrintWriter out = new PrintWriter(output);
        int size = namesArray.length;
 
        for (int i = 0; i < size; i++) {
            out.println(namesArray[i] + ": " + handlesArray[i]);
        }

        out.close();
    }
}