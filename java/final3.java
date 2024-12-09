/**
* @author Ben Huynh
* CIS 36A
*/

import java.io.*;
import java.util.Scanner;

public class Credit {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a file containing credit cards: ");
        String inputName = scanner.nextLine();
        
        File inputFile = new File(inputName);
        Scanner inputScanner = new Scanner(inputFile);

        int size = inputScanner.nextInt();
        inputScanner.nextLine();
        String[] creditArray = new String[size];

        for (int i = 0; i < creditArray.length; i++) {
            creditArray[i] = inputScanner.nextLine();
        }

        System.out.print("Enter the name of a file in which to print: \n");
        String outputName = scanner.nextLine();
        File output = new File(outputName);
        PrintWriter writer = new PrintWriter(output);

        System.out.println("Reading " + inputName + " and processing " + size + " credit cards.");
        System.out.println("Open " + outputName + " for redacted credit card information.");

        redactCards(creditArray);
        printCards(creditArray, writer);
        
        inputScanner.close();
        scanner.close();
    }

    /**
     * Purpose: Redacts CC numbers by replacing the first 12 digits with *s
     * @param String[] creditArray
     * @return void
     */
    public static void redactCards(String[] creditArray) {
        final int REDACTED_INDEX = 4;
        
        for (int i = 0; i < creditArray.length; i++) {
            String redactedCard = "";
            String card = creditArray[i];   
            String last4 = card.substring(card.length() - REDACTED_INDEX, card.length());
            
            for (int j = 0; j < card.length() - REDACTED_INDEX; j++) {
                redactedCard += "*";
            }
            
            redactedCard = redactedCard + last4;

            creditArray[i] = redactedCard; 
        }
    }

    
    /**
     * Purpose: Prints the redacted card number
     * @param String[] creditArray
     * @return void
     */
    public static void printCards(String[] creditArray, PrintWriter writer) throws IOException {
        for(int i = 0; i < creditArray.length; i++) {
            writer.println(creditArray[i]);
        }
        writer.close();
    }
}