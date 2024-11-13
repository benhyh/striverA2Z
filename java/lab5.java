/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input
      int inputSize = input.nextInt();

      for (int i = 0; i < inputSize; i++) {
          userValues[i] = input.nextInt();
      }

      final int VALUE = userValues[inputSize - 1];
      
      for (int i = 0; i < inputSize - 1; i++) {  
          if (userValues[i] <= VALUE) {
              System.out.print(userValues[i] + ",");
          }
      }
      System.out.println();  
      
      input.close();
   }
}