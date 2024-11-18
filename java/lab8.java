/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class CharCount {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String text;
      int ans = 0;

      System.out.println("Enter text: ");
      text = input.nextLine();

      ans = countCharacters(text);
      System.out.println("The string contains " + ans + " ETAON's.");
      
   }

   public static int countCharacters(String text) {
        int ans = 0;
        for (int i = 0; i < text.length(); i++) {
            int pointer = i + 1;
            String ch = text.substring(i, pointer);  // get current character as a string
            if (ch.equalsIgnoreCase("e") || 
                ch.equalsIgnoreCase("t") || 
                ch.equalsIgnoreCase("a") || 
                ch.equalsIgnoreCase("o") || 
                ch.equalsIgnoreCase("n")) {
                ans++;
            }
        }
        return ans;
   }
}

/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class CapDig {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String text;
      int capitalCount;
      int digits;

      System.out.println("Enter text: ");
      text = input.nextLine();

      capitalCount = capitalCounter(text);
      System.out.println("The string contains " + capitalCount + " capital letters.");
      
      digits = containsDigit(text);
      if (digits == 0 ) System.out.println("The sentence does not contain digits.");
      else System.out.println("The sentence does contain digits.");
   }
   
   public static int capitalCounter (String text) {
    for (int i = 0; i < text.length(); i++) {
        int capitalCount = 0; 
        
        char character = text.charAt(i);
        if (character >= 'A' && character <= 'Z') capitalCount++;
        
        return capitalCount;
    }
   }

   public static int containsDigit (String text) {
      for (int i = 0; i < text.length(); i++) {
         int digits = 0;
        
         char character = text.charAt(i);
         if (character >= '0' && character <= '9') digits++;
         
         return digits;
      }
   }
}