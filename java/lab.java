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

public class Passwords {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String password = scnr.nextLine();
      
      int index;
      
      // Find and replace first 'i'
      index = password.indexOf('i');
      if (index != -1) {
          password = password.substring(0, index) + "1" + password.substring(index + 1);
      }
      
      // Find and replace first 'a'
      index = password.indexOf('a');
      if (index != -1) {
          password = password.substring(0, index) + "@" + password.substring(index + 1);
      }
      
      // Find and replace first 'm'
      index = password.indexOf('m');
      if (index != -1) {
          password = password.substring(0, index) + "M" + password.substring(index + 1);
      }
      
      // Find and replace first 'B'
      index = password.indexOf('B');
      if (index != -1) {
          password = password.substring(0, index) + "8" + password.substring(index + 1);
      }
      
      // Find and replace first 's'
      index = password.indexOf('s');
      if (index != -1) {
          password = password.substring(0, index) + "$" + password.substring(index + 1);
      }
      
      System.out.println(password + "!");
      scnr.close();
   }
}

public class Pizza {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int people = scnr.nextInt();
        int pizzasSlices = 12;
        int slicesPerPizza = people * 2;

        double pizzasNeeded = Math.ceil((double)slicesPerPizza / pizzaSlices);
        double price = pizzasNeeded * 14.95;
        
        String firstTopping = scnr.next();
        scnr.nextLine();

        String secondTopping = scnr.next();
        scnr.nextLine();
        
        String thirdTopping = scnr.next();
        scnr.nextLine();

        String fourthTopping = scnr.next();
        scnr.nextLine();


        System.out.println("People: " + people);
        System.out.println("Pizza(s) needed: " + (int)pizzasNeeded);
        System.out.printf("Cost for %.0f pizza(s): $%.2f%n", pizzasNeeded, price);
        System.out.println("Toppings: " + firstTopping + ", " + secondTopping + ", " + thirdTopping + ", " + fourthTopping);

        scnr.close();
   }
}

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int numChars = 0;
        char character = scnr.next().charAt(0);
        String userInput = scnr.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == character) {
                numChars++;
            }
        }

        if (numChars == 1) {
            System.out.println(numChars + " " + character);
        } else {
            System.out.println(numChars + " " + character + "'s");
        }

        scnr.close();
    }
}