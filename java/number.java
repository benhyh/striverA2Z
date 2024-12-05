/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.io.*;
import java.util.Scanner;

public class Nums {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        String fileName;
        
		System.out.println("Welcome!");
        System.out.println("Enter the name of an input file: ");
        fileName = input.nextLine();
        File input = new File(fileName);
        

        double array[] = readFile(input);
        int num = array.length;
        System.out.println("There are " + num + " numbers in the file.");

        double resultsArray[] = new double[2];
        calcArray(array, resultsArray);

        System.out.printf("The sum of the numbers is %.1f%n", resultsArray[0]);
        System.out.printf("The product of the numbers is %.1f%n", resultsArray[1]);

        String outputFileName = "results.txt";
        writeFile(outputFileName, resultsArray);

        input.close();
	}
	
    /**
     * Reads the data contained in the given input file and creates an array of doubles containing the data in the file
     * @param name - data of string type which is the input file name
     * @return An array of doubles
     */

	public static double[] readFile(String file) throws IOException {
        Scanner input = new Scanner(file);
        
        int size = input.nextInt();
        double doubleArray[] = new double[size];

        input.close();
        
        input = new Scanner(file);
 
        while (input.hasNextDouble()) {
            for (int i = 0; i < size; i++) {
                doubleArray[i] = input.nextDouble();
            }
        }
 
        input.close();
        return doubleArray;
    }

    /**
     * Calculates the sum and product of the values stored in a given array. Stores the sum and product in indices 0 and 1 of a second array parameter.
     * @param an array of double containing a list of values for computation
     * @param an empty array of doubles of length 2 
     * @return nothing
     */

    public static void calcArray(double[] array, double[] resultsArray) {
        double sum = 0.0;
        double product = 1.0;
        int size = array.size();

        for (int i = 0; i < size; i++) {
            sum += array[i];
            product *= array[i];;
        }

        resultsArray[0] = sum;
        resultsArray[1] = product;    
    }

    /**
     * Writes the sum and product to a text file whose name is provided as a parameter
     * @param String for the output file name
     * @return An array of doubles of length 2, with the sum contained in index 0 and product contained in index 1
     */

    public static double[] writeFile(String name, double[] resultsArray) throws IOException {
        File output = new File(name);
        PrintWriter writer = new PrintWriter(output);
        writer.printf("The sum of the numbers is %.1f%n", resultsArray[0]);
        writer.printf("The product of the numbers is %.1f%n", resultsArray[1]);
    }
}
