/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.util.Scanner;   

public class Track {
   public static double lapsToMiles(double laps) {
        double miles = laps * 0.25;
        return miles;
   }
   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double laps;
        laps = input.nextDouble();
        
        double miles = lapsToMiles(laps);
        System.out.printf("%.2f\n", miles);
        input.close();
   }   
}

public class LabProgram {
   
   /* Define your method here */
   public static float jiffiesToSeconds (float jiffies) {
        float seconds = jiffies / 100;
        return seconds;
   }
   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float jiffies;
        jiffies = input.nextFloat();
        
        double miles = jiffiesToSeconds(jiffies);
        System.out.printf("%.3f\n", miles);
        input.close();
   }
}
