/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class Normalizing {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double largest = 0.0;
      
      int value = input.nextInt();

      double[] arr = new double[value];

      for (int i = 0; i < value; i++) {
        arr[i] = input.nextDouble();
        if (arr[i] > largest) {
            largest = arr[i];
        }
      }

      for (int i = 0; i < value; i++) {
         double newValues = arr[i] / largest;
         System.out.printf("%.2f ", newValues);
      }
      
      System.out.println();

      input.close();
   }
}
