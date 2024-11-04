/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class PasswordReset {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		String passwordConfirm;
		final int MAX_TRIES = 5;
		
		System.out.println("Welcome to the password reset service!");		
		System.out.println("Enter your new password: ");
        password = input.next();
        System.out.println("Enter your new password again: ");
        passwordConfirm = input.next();
        
        if (!password.equals(passwordConfirm)) {
            System.out.print("Sorry! Those passwords don't match. Try again: ");
            passwordConfirm = input.next();
        }
        if (password.equals(passwordConfirm)) {
            System.out.println("Password confirmed. Logging out...\n");
            for (int i = MAX_TRIES; i > 0; i--) {
                System.out.print("Enter your password: ");
                password = input.next();
                if (password.equals(passwordConfirm)) {
                    System.out.println("Welcome! You are now logged in.");
                    i = 0; //What does this line do? Make sure you understand
                } else {
                    System.out.print("Invalid password.");
                    System.out.print("You have " + (i - 1) + " tries left.\n");
                }
            }
        } else {
            System.out.println("Sorry! Those passwords don't match.");
        	System.out.println("Goodbye!");
        }
       
        input.close();
   }
}
