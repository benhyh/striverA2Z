/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*** Strings on Repeat ***");
        
        System.out.print("Enter a String statement: ");
        String statement = input.nextLine();
        
        System.out.print("Enter one character: ");
        char character = input.next().charAt(0);
        
        System.out.print("Enter a number between 1 and 19: ");
        int number = input.nextInt();
        
        System.out.println();
        
        // Problem #1
        System.out.println("Printing a string of " + character + "'s the length of the String");
        System.out.print("#1: ");
        for (int i = 0; i < statement.length(); i++) {
            System.out.print(character);
        }
        System.out.println("\n" + character + "-out the String\n");
        
        // Problem #2
        System.out.println("Alternating printing " + character + " for the even letters of the String");
        System.out.print("#2: ");
        for (int i = 0; i < statement.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(character);
            } else {
                System.out.print(statement.charAt(i));
            }
        }
        System.out.println("\nAn alteration from a " + character + "-designation!\n");
        
        // Problem #3
        System.out.println("Alternating printing " + number + " for the odd letters of the String");
        System.out.print("#3: ");
        for (int i = 0; i < statement.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(number);
            } else {
                System.out.print(statement.charAt(i));
            }
        }
        System.out.println("\nAn alteration from enumeration!\n");
        
        // Problem #4
        System.out.println("#4: Printing the letters of the String from first to last using nested loops.");
        for (int i = 1; i <= statement.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(statement.charAt(j));
            }
            System.out.println();
        }
        System.out.println("Now that makes a statement!\n");
        
        // Problem #5
        System.out.println("Counting " + character + "'s. Yipee!");
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("#5: There are " + count + " " + character + "'s in " + statement + ".\n");
        
        // Problem #6
        System.out.println("Printing the letters greater than " + character + " or a dash instead.");
        System.out.print("#6: ");
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) > character) {
                System.out.print(statement.charAt(i));
            } else {
                System.out.print("-");
            }
        }
        System.out.println("\nThat is dashed good!\n");
        
        // Problem #7
        System.out.println("Printing \"" + statement + "\" with all words capitalized.");
        System.out.print("#7: ");
        
        String result = statement.substring(0, 1).toUpperCase() + statement.substring(1);
        
        // Find spaces and capitalize next character
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ' && i + 1 < result.length()) {
                result = result.substring(0, i + 1) + 
                        result.substring(i + 1, i + 2).toUpperCase() + 
                        result.substring(i + 2);
            }
        }
        
        System.out.println(result);
        System.out.println("That was a challenge!");
        
        input.close();
    }
}