/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner; 

public class Mult10 {
   
   /**
    * description: returns true if all integers in the array parameter are multiples of t10 and false otherwise.
    * @param int[] arrayRef - the referenced string array
    * @return true if all variables are multiples of 10, false otherwise
    */
   public static boolean isArrayAllMult10(int[] arrayRef) {
        final int DIVISOR = 10;
        int count = 0; 
        int arrayLength = arrayRef.length;
        for (int i = 0; i < arrayLength; i++) {
            if (arrayRef[i] % DIVISOR == 0) {
                count += 1;
            } else {
                count += 0;
            }
        } 
        if (count == arrayLength) return true;
        else return false;
   }

   /**
    * description: returns true if one integer in the array parameter is a multiple of 10 and false otherwise. 
    * @param int[] arrayRef - the referenced string array
    * @return true if one of the variables is a multiple of 10, false if none is
    */
   public static boolean hasArrayMult10(int[] arrayRef) {
        final int DIVISOR = 10;
        int count = 0; 
        int arrayLength = arrayRef.length;
        for (int i = 0; i < arrayLength; i++) {
            if (arrayRef[i] % DIVISOR == 0) {
                count += 1;
            } else {
                count += 0;
            }
        }
        if (count >= 1) return true;
        else return false;
   }

   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength;
        int i;
        int[] integerArray;

        arrayLength = input.nextInt();
        integerArray = new int[arrayLength];

        for (i = 0; i < integerArray.length; i++) {
            integerArray[i] = input.nextInt();
        } 

        boolean allVariables = isArrayAllMult10(integerArray);
        boolean oneVariable = hasArrayMult10(integerArray);

        if (allVariables == true && oneVariable == true) {
            System.out.println("all multiples of 10");
        } else if (allVariables == false && oneVariable == true) {
            System.out.println("mixed values");
        } else {
            System.out.println("no multiples of 10");
        }
        
        input.close();
   }
}
