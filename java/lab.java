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

public class PlanetHero {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String choice;
      int points = 0;

      boolean main = true;
      boolean big = false;
      boolean medium = false;
      boolean small = false;

      System.out.println("Welcome to Planet Hero!\n");

      do {     
        System.out.println("Choose a category to make an impact:\n");
        System.out.println("1. Big Impact Actions");
        System.out.println("2. Medium Impact Actions");
        System.out.println("3. Small Impact Actions");
        System.out.println("Q. Quit and Get Total Points");
        System.out.print("\nEnter your choice: ");
        choice = scnr.nextLine().toUpperCase();

        if(choice.equals("Q")) {
            main = false;
          System.out.println("Total points: " + points);
        } else if (choice.equals("1")) {
          big = true;
        } else if (choice.equals("2")) {
          medium = true;
        } else if (choice.equals("3")) {
          small = true;
        } else {
            System.out.println("Invalid choice. Please try again.\n");
        }
            
        do {
            System.out.println("Which BIG IMPACT action(s) will you pledge to take?\n");

            scnr.nextLine().toUpperCase();

            System.out.println("1. Pledge to stop flying (100 pts)");
            System.out.println("2. Join a climate action group (100 pts)");
            System.out.println("3. Adopt a 100% plant-based diet (100 pts)");
            System.out.println("4. Replace your furnace with a heat pump (80 pts)");
            System.out.println("R. Return to main menu");


            if (choice.equals("R")) {
                System.out.println("\nReturning to main menu...\n");
                big = false;
            } else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                    points += 100;
                } else if (choice.equals("4")) {
                    points += 80;
                }
            }

        } (while big);
        
        do {
            System.out.println("Which MEDIUM IMPACT action(s) will you pledge to take?\n");
            
            System.out.println("1. Attend a climate rally (35 pts)");
            System.out.println("2. Replace your lawn with a pollinator garden (40 pts)");
            System.out.println("3. Check if your bank invests in dirty energy companies (40 pts)");
            System.out.println("4. Buy only used clothes (50 pts)");
            System.out.println("R. Return to main menu");
            
        } (while medium);
        
        do {
            System.out.println("Which SMALL IMPACT action(s) will you pledge to take?\n");

            System.out.println("1. Wash your clothes on the cold cycle and air dry them (30 pts)");
            System.out.println("2. Bring a resuable mug to the coffee shop (10 pts)");
            System.out.println("3. Compost your food waste (20 pts)");
            System.out.println("4. Turn off the shower when soaping up (5 pts)");
            System.out.println("R. Return to main menu");

        } (while small);

      } while (main);



      scnr.close();
   } (while main)
}

