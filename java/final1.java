/**
 * @author Ben Huynh 
 * CIS 36A
 */

import java.util.Scaner;
import java.io.*;

public class TeleMarket {
    public class void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of a file: ");
        String fileName = scanner.nextLine();
        File inputFile = new File(fileName);
        Scanner inputScanner = new Scanner(inputFile);

        String[] customerArray = readCustomerFile(inputScanner);
        System.out.println("Reading " + fileName + " and generating report...");
        
        writeScript(customerArray)

        System.out.println("Open script.txt for auto-generated call script")
        
        inputScanner.close();
        scanner.close();
    }

    /**
     * Purpose: Use the param scanner to read from a file and store the data from the file inside an array of Strings
     * @param Scanner scanner - the scanner that is already connected to the input file
     * @return An array of strings 
     */
    public static String[] readCustomerFile(Scanner scanner) throws IOException {
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] formattedNames = new String[size];

        for (int i = 0; i < size; i++) {
            String fullName = scanner.nextLine();
            char gender = scanner.nextLine().charAt(0);
                
            String prefix = "";

            if (gender == 'M') {
                prefix = "Mr.";
            } else if (gender == 'F') {
                prefix = "Ms.";
            } else {
                prefix = "Mx.";
            }

            int lastSpaceIndex = -1;
            for (int j = fullName.length() - 1; j >= 0; j--) {
                if (fullName.charAt(j) == ' ') {
                    lastSpaceIndex = j;
                }
            }
            String lastName = fullName.substring(lastSpaceIndex, fullName.length());

            formattedNames[i] = prefix + " " + lastName;    
        }

        return formattedNames;
    }

    /**
     * Purpose: It takes a parameter that is an array of Strings storing customer information
     * @return nothing
     */

    public static void writeScript(String[] customerArray) throws IOException {
        File script = new File("script.txt");
        PrintWriter writer = new PrintWriter(script);

        int size = customerArray.length;

        for (int i = 0; i < size; i++) {
            out.println("Good evening, " + customerArray[i]);
            out.println("Do you have a few minutes?");
            out.println("I want to let you know about an exciting offer on widgits.\n");
        }

        writer.close();
    }
}   