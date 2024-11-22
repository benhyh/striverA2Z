/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String choice;
      String text;

      System.out.println("*** Unicode Encryption ***\n");

      System.out.println("Enter \"e\" to encrypt, \"d\" to decrypt or \"x\" to exit (e/d/x): ");
      choice = input.next().charAt(0) +  "";
      input.nextLine();

      if (!choice.equals("e") &&
      !choice.equals("d") &&
      !choice.equals("x")) {
            System.out.println("Unrecognized command: " + choice);
      } else if (choice.equals("e")) {
            System.out.println("Enter the string to encrypt: ");
            text = input.nextLine();
            encrypt(text);
      } else if (choice.equals("d")) {
            System.out.println("Enter the string to decrypt: ");
            text = input.nextLine();
            decrypt(text);
      } else if (choice.equals("x")) {
            System.out.println("Good bye!");
      }

      input.close();
   }
   
   /**
    * Encryption method.
    * @param userInput This param is the string that users want to encrypt.
    */
   public static void encrypt(String userInput) {
        String encryptionString = "";
        final int DIVISION = 10;
        final int UNICODEINT = 48;

        for (int i  = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            int unicodeValue = (int) currentChar;

            int firstDigit = unicodeValue / DIVISION;
            int lastDigit = unicodeValue % DIVISION;
            
            firstDigit += UNICODEINT;
            lastDigit += UNICODEINT;

            encryptionString = encryptionString + (char)lastDigit + (char)firstDigit;
        } 

        System.out.println("ciphertext: " + encryptionString);
   }

   /**
    * Decryption method.
    * @param userInput This param is the string that users want to decrypt.
    */
   public static void decrypt(String userInput) {
      String decryptionString = "";
      final int MULTIPLICATION = 10;
      final int UNICODEINT = 48;

      for (int i = 0; i < userInput.length(); i += 2) {
            char char1 = userInput.charAt(i);
            char char2 = userInput.charAt(i + 1);

            char1 -= UNICODEINT;
            char2 -= UNICODEINT;

            int letter = char2 * MULTIPLICATION + char1;

            decryptionString = decryptionString + (char)letter;
      }
        System.out.println("plaintext: " + decryptionString);
   }
}
;