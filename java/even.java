/**
 * @author Ben Huynh
 * CIS 36A
 */
import java.util.Scanner;

public class ArrayEvens {

	/**
     * purpose: counts the total number of even numbers inside an array of integers
     * @param int[] arrayRef - the referenced array to count how many even numbers
     * @return an integer value representing how many even numbers there are in the array
     */

    public static int countEvens(int[] arrayRef) {
        int count = 0;
        final int DIVISOR = 2;
        int arrayLength = arrayRef.length;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayRef[i] % DIVISOR == 0) count += 1;
            else count += 0;
        }
        
        return count;
    }

	/**
     * purpose: prints all even numbers inside an array of integers, with each number followed by a comma space
     * @param int[] arrayRef - the referenced array to print all even number
     * @return void - only prints out each even number in the array
     */

    public static void printEvens(int[] arrayRef) {
        final int DIVISOR = 2;
        int arrayLength = arrayRef.length;

        for (int i = 0; i < arrayLength; i++) {
            if (arrayRef[i] % DIVISOR == 0) {
                System.out.print(arrayRef[i] + ", ");
            }
        }   
    }
    
	/**
     * purpose: reads a list of numbers using the Scanner and stores them in an array
     * @param Scanner
     * @param refArray
     * @return void - populates the array with elements input by the user
     */

    public static void readInput (Scanner scanner, int[] arrayRef) {
        int arrayLength = arrayRef.length;
        for (int i = 0; i < arrayLength; i++) {
            arrayRef[i] = scanner.nextInt(); 
        }
    }

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int len = input.nextInt();
      int[] integerArray = new int[len];
      readInput(input, integerArray);
      input.close();
      
		int result = countEvens(integerArray);
		System.out.println("Total evens: " + result);
		printEvens(integerArray);
	}
}
