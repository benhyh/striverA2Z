/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[6];

        names[0] = "Grace Hopper"; 
        names[1] = "Ada Lovelace"; 
        names[2] = "Dorothy Vaughn";

        System.out.println("The first 3 names:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

        System.out.println();
        for (int i = 3; i < names.length; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = input.nextLine();
        }
        
        System.out.println();
        System.out.println("\nThe 6 names are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        input.close();
    }
} 