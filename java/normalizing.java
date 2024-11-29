/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class Normalize {
    
    /**
     * purpose: searches for the maximum value in the input array, 
     * and returns it when found
     * @param arrayRef input float array to find maximum value
     * @return maximum value in the array
     */
    public static double getMax(double[] arrayRef) {
        double max = arrayRef[0];
        int arrayLength = arrayRef.length;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayRef[i] >= max) {
                max = arrayRef[i];
            } 
        }

        return max;
    }

    /**
     * purpose: prints out each array value after 
     * it has been subtracted from the max, followed by a blank space
     * @param arrayRef input float array to normalize
     * @param maxValue maximum value used for normalization
     */
    public static void printNormalizedArray(double[] arrayRef, double maxValue) {
        int arrayLength = arrayRef.length;

        for (int i = 0; i < arrayLength; i++) {
            arrayRef[i] = arrayRef[i] - maxValue;
        }
        
        System.out.print("Normalized Values: ");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.1f ", Math.abs(arrayRef[i]));
        }
    } 

    /**
     * purpose: reads a list of 
     * numbers using the Scanner and stores them in an array
     * @param scanner input Scanner object for reading values
     * @param arrayRef input float array to store read values
     */
    public static void readInput(Scanner scanner, double[] arrayRef) {
        int arrayLength = arrayRef.length;
        for (int i = 0; i < arrayLength; i++) {
            arrayRef[i] = scanner.nextDouble();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        double[] floatArray = new double[len];

        readInput(scanner, floatArray);

        double max = getMax(floatArray);

        System.out.printf("Max Value: %.1f", max);
        System.out.print();

        printNormalizedArray(floatArray, max);

        scanner.close();
    }
}