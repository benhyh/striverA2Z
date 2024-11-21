/**
 * @author Ben Huynh
 * CIS 36A
 */
import java.util.Scanner;
public class VoidDateTime {
   public static void printUSDate(int year, int month, int day) {
        if (month < 10 && day < 10) {
            System.out.println("U.S. date format: 0" + month + "-0" + day + "-" + year);
        }
        else if (month < 10) {
            System.out.println("U.S. date format: 0" + month + "-" + day + "-" + year);
        }
        else if (day < 10) {
            System.out.println("U.S. date format: " + month + "-0" + day + "-" + year);
        }
        else {
            System.out.println("U.S. date format: " + month + "-" + day + "-" + year);
        }
   }
   
   public static void printEuropeanDate(int year, int month, int day) {
        if (month < 10 && day < 10) {
            System.out.println("European date format: 0" + day + ".0" + month + "." + year);
        }
        else if (month < 10) {
            System.out.println("European date format: " + day + ".0" + month + "." + year);
        }
        else if (day < 10) {
            System.out.println("European date format: 0" + day + "." + month + "." + year);
        }
        else {
            System.out.println("European date format: " + day + "." + month + "." + year);
        }
   }
   
   public static void printUSTime(int hour, int minutes, boolean AM) {
        if (AM && minutes < 10) {
            System.out.println("U.S. time: " + hour + ":0" + minutes + "am");
        }
        else if (!AM && minutes < 10) {
            System.out.println("U.S. time: " + hour + ":0" + minutes + "pm");
        }
        else if (AM && minutes >= 10) {
            System.out.println("U.S. time: " + hour + ":" + minutes + "am");
        }
        else {
            System.out.println("U.S. time: " + hour + ":" + minutes + "pm");
        }
    }
    
    public static void printEuropeanTime(int hour, int minutes, boolean AM) {
        int europeanHour = hour;
        if (!AM) {
            europeanHour += 12;
        }
        if (minutes < 10) {
            System.out.println("European time: " + europeanHour + ":0" + minutes);
        }
        else if (hour < 10) {
           System.out.println("European time: 0" + europeanHour + ":" + minutes);
         }
        else {
            System.out.println("European time: " + europeanHour + ":" + minutes);
        }
    }
    
   public static void main(String[] args) {
      int year;
      int day;
      int month;
      int hour;
      int minutes;
      boolean isAM;
        
      Scanner input = new Scanner(System.in);
      year = input.nextInt();
      month = input.nextInt();
      day = input.nextInt();
      hour = input.nextInt();
      minutes = input.nextInt();
      isAM = input.nextBoolean();
      
      printUSDate(year, month, day);
      printUSTime(hour, minutes, isAM);
      printEuropeanDate(year, month, day);
      printEuropeanTime(hour, minutes, isAM);
      input.close();
   }
}