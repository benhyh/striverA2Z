import java.util.*;

public class Main {
    public static void main(String[] args) {
        String decryptionString = "";
        final int DIVISION = 10;
        final int UNICODEINT = 48;
        
        char character1 = '2';
        char character2 = '7';
        
        character1 -= 48;
        character2 -= 48;
        
        int letter = character2 * 10 + character1;
        
        // System.out.println((int)character1);
        // System.out.println((int)character2);
        
        // System.out.println(letter);
        
        decryptionString = decryptionString + (char)letter;
        
        System.out.println(decryptionString);
        
    }
} 