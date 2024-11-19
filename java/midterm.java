/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int items;

        System.out.println("Menu:");
        System.out.println("Hash browns (HB)");
        System.out.println("Beef steak (BS)");
        System.out.println("Pho (PH)");
        System.out.println("Banh Mi (BM)");

        System.out.println("Enter the amount of items: ");
        items = input.nextInt();
        input.nextLine(); 

        String[] food = new String[items];

        System.out.println("Enter items in format: quantity followed by item code (e.g., 2HB for 2 hash browns)");
        for (int i = 0; i < items; i++) {
            System.out.println("Enter item #" + i + ": ");
            food[i] = input.nextLine();
        }

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Order summary for " + name);

        for (int i = 0; i < food.length; i++) {
            char digit = food[i].charAt(0);
            String abbreviated = food[i].substring(1, food[i].length());
            System.out.println("You ordered " + digit + " of " + abbreviated + "(s)");
        }
 
        input.close();
    }
}