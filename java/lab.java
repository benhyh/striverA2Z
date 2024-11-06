/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class NestedLoops {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      char currentRowLetter;
      int currentColumn;
      int currentColumnInteger;
   
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      /* Your code goes here */
      for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
        for (currentRow = 1; currentRow <= numColumns; currentRow++) {
            System.out.print("" + currentRowLetter + currentColumnInteger + " ");
            currentColumnInteger++;
            if (currentColumnInteger == numColumns) {
                currentColumnInteger = 1;
            }
        }
        currentRowLetter++;
        System.out.println();
      }       

   }
}

public class Statistics {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        int sum; 

        do {
            userInput = scnr.nextInt();

            if (userInput == 0) break;
                

        } while (userInput.hasNextInt());

        System.out.println("" + max + average);

        scnr.close();
    }
}

public class Triangle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        for (int i = 1; i <= userInput; i++) {
            for (int j = userInput; j>=i; j--) {
                System.out.println("* ");
            }
            System.out.println();
        }

        scnr.close();
    }
} 