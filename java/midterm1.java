/**
* @author Ben Huynh
* CIS 36A
*/


import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city;
        String code;
        String codeWeather;
        String weatherInput = " ";
        String chance;
        boolean program = true;

        String[] weatherCode = {"SUN", "SNW", "FG", "RN"};
        String[] weather = {"sun", "snow", "fog", "rain"};
        
        System.out.println("**Weather Report**");

        while (program) {
           
            final int FIRSTINDEX = 0;
            final int SECONDINDEX = 1;
            final int THIRDINDEX = 2;
            final int FOURTHINDEX = 3;
           
            String sunCode = weatherCode[FIRSTINDEX];
            String snowCode = weatherCode[SECONDINDEX];
            String fogCode = weatherCode[THIRDINDEX];
            String rainCode = weatherCode[FOURTHINDEX];
           
            String sun = weather[FIRSTINDEX];
            String snow = weather[SECONDINDEX];
            String fog = weather[THIRDINDEX];
            String rain = weather[FOURTHINDEX];
               
            System.out.println("\nEnter the weather code or X to exit: ");
            code = input.nextLine();
            
            if (code.toUpperCase().equals("X")) {
               program = false;
               System.out.println("\n Goodbye!");
            }
            
            chance = code.substring(0, 2);
            codeWeather = code.substring(2, code.length());

            if (codeWeather.toUpperCase().equals(sunCode)) {
               weatherInput = sun;
            } else if (codeWeather.toUpperCase().equals(snowCode)) {
               weatherInput = snow;
            } else if (codeWeather.toUpperCase().equals(fogCode)) {
               weatherInput = fog;
            } else if (codeWeather.toUpperCase().equals(rainCode)) {
               weatherInput = rain;
            } else {
               System.out.println("Invaild input. Please try again.");   
            }
         
            System.out.println("Enter your city: ");
            city = input.nextLine();

            System.out.println("Forecast for " + city + ": " + chance + " percent chance of " + weatherInput + ".\n");

        } 

        input.close();
    }
}