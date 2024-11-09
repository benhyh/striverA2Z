/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class PlanetHero {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Point thresholds for achievements
        final int FRIEND_MIN = 1;
        final int DEFENDER_MIN = 50;
        final int HERO_MIN = 100;
        final int SUPERSTAR_MIN = 150;
        
        // Points for big impact actions
        final int POINTS_STOP_FLYING = 100;
        final int POINTS_JOIN_GROUP = 100;
        final int POINTS_PLANT_BASED = 100;
        final int POINTS_HEAT_PUMP = 80;
        
        // Points for medium impact actions
        final int POINTS_CLIMATE_RALLY = 35;
        final int POINTS_GARDEN = 40;
        final int POINTS_BANK_CHECK = 40;
        final int POINTS_USED_CLOTHES = 50;
        
        // Points for low impact actions
        final int POINTS_COLD_WASH = 30;
        final int POINTS_REUSABLE_MUG = 10;
        final int POINTS_COMPOST = 20;
        final int POINTS_SHOWER = 5;
        
        String choice;
        String lastChoice = "";
        int points = 0;
        boolean mainLoop = true;
        boolean bigLoop = false;
        boolean mediumLoop = false;
        boolean lowLoop = false;
        
        System.out.println("Welcome to Planet Hero!\n");
        
        do {
            System.out.println("Choose a category to make an impact:\n");
            System.out.println("1. Big Impact Actions");
            System.out.println("2. Medium Impact Actions");
            System.out.println("3. Small Impact Actions");
            System.out.println("Q. Quit and Get Total Points\n");
            System.out.println("Enter your choice: ");
            choice = scnr.nextLine().toUpperCase();
            
            if (choice.equals("1")) {
                bigLoop = true;
                do {
                    System.out.println("Which BIG IMPACT action(s) will you pledge to take?\n");
                    System.out.println("1. Pledge to stop flying (" + POINTS_STOP_FLYING + " pts)");
                    System.out.println("2. Join a climate action group (" + POINTS_JOIN_GROUP + " pts)");
                    System.out.println("3. Adopt a 100% plant-based diet (" + POINTS_PLANT_BASED + " pts)");
                    System.out.println("4. Replace your furnace with a heat pump (" + POINTS_HEAT_PUMP + " pts)");
                    System.out.println("R. Return to main menu");
                    System.out.println("\nEnter your choice: ");
                    choice = scnr.nextLine().toUpperCase();
                    
                    if (choice.equals(lastChoice)) {
                        System.out.println("You already made that pledge!");
                        System.out.println("Please select a new option or return to the main menu.\n");
                    }
                    else if (choice.equals("R")) {
                        System.out.println("Returning to main menu...\n");
                        bigLoop = false;
                    }
                    else if (choice.equals("1")) {
                        points += POINTS_STOP_FLYING;
                        lastChoice = choice;
                    }
                    else if (choice.equals("2")) {
                        points += POINTS_JOIN_GROUP;
                        lastChoice = choice;
                    }
                    else if (choice.equals("3")) {
                        points += POINTS_PLANT_BASED;
                        lastChoice = choice;
                    }
                    else if (choice.equals("4")) {
                        points += POINTS_HEAT_PUMP;
                        lastChoice = choice;
                    }
                    else {
                        System.out.println("Invalid choice. Please try again.\n");
                    }
                } while (bigLoop);
            }
            else if (choice.equals("2")) {
                mediumLoop = true;
                do {
                    System.out.println("Which MEDIUM IMPACT action(s) will you pledge to take?\n");
                    System.out.println("1. Attend a climate rally (" + POINTS_CLIMATE_RALLY + " pts)");
                    System.out.println("2. Replace your lawn with a pollinator garden (" + POINTS_GARDEN + " pts)");
                    System.out.println("3. Check if your bank invests in dirty energy companies (" + 
                                     POINTS_BANK_CHECK + " pts)");
                    System.out.println("4. Buy only used clothes (" + POINTS_USED_CLOTHES + " pts)");
                    System.out.println("R. Return to main menu");
                    System.out.println("\nEnter your choice: ");
                    choice = scnr.nextLine().toUpperCase();
                    
                    if (choice.equals(lastChoice)) {
                        System.out.println("You already made that pledge!");
                        System.out.println("Please select a new option or return to the main menu.\n");
                    }
                    else if (choice.equals("R")) {
                        System.out.println("Returning to main menu...\n");
                        mediumLoop = false;
                    }
                    else if (choice.equals("1")) {
                        points += POINTS_CLIMATE_RALLY;
                        lastChoice = choice;
                    }
                    else if (choice.equals("2")) {
                        points += POINTS_GARDEN;
                        lastChoice = choice;
                    }
                    else if (choice.equals("3")) {
                        points += POINTS_BANK_CHECK;
                        lastChoice = choice;
                    }
                    else if (choice.equals("4")) {
                        points += POINTS_USED_CLOTHES;
                        lastChoice = choice;
                    }
                    else {
                        System.out.println("Invalid choice. Please try again.\n");
                    }
                } while (mediumLoop);
            }
            else if (choice.equals("3")) {
                lowLoop = true;
                do {
                    System.out.println("Which LOW IMPACT action(s) will you pledge to take?\n");
                    System.out.println("1. Wash your clothes on the cold cycle and air dry them (" + 
                                     POINTS_COLD_WASH + " pts)");
                    System.out.println("2. Bring a reusable mug to the coffee shop (" + POINTS_REUSABLE_MUG + " pts)");
                    System.out.println("3. Compost your food waste (" + POINTS_COMPOST + " pts)");
                    System.out.println("4. Turn off the shower when soaping up (" + POINTS_SHOWER + " pts)");
                    System.out.println("R. Return to main menu");
                    System.out.println("\nEnter your choice: ");
                    choice = scnr.nextLine().toUpperCase();
                    
                    if (choice.equals(lastChoice)) {
                        System.out.println("You already made that pledge!");
                        System.out.println("Please select a new option or return to the main menu.\n");
                    }
                    else if (choice.equals("R")) {
                        System.out.println("Returning to main menu...\n");
                        lowLoop = false;
                    }
                    else if (choice.equals("1")) {
                        points += POINTS_COLD_WASH;
                        lastChoice = choice;
                    }
                    else if (choice.equals("2")) {
                        points += POINTS_REUSABLE_MUG;
                        lastChoice = choice;
                    }
                    else if (choice.equals("3")) {
                        points += POINTS_COMPOST;
                        lastChoice = choice;
                    }
                    else if (choice.equals("4")) {
                        points += POINTS_SHOWER;
                        lastChoice = choice;
                    }
                    else {
                        System.out.println("Invalid choice. Please try again.\n");
                    }
                } while (lowLoop);
            }
            else if (choice.equals("Q")) {
                mainLoop = false;
                System.out.println("Total points... " + points + "\n");
                
                if (points == 0) {
                    System.out.println("Thanks for considering planet.");
                }
                else if (points >= FRIEND_MIN && points < DEFENDER_MIN) {
                    System.out.println("***You're a friend to the planet!***");
                }
                else if (points >= DEFENDER_MIN && points < HERO_MIN) {
                    System.out.println("***You're a planetary defender!***");
                }
                else if (points >= HERO_MIN && points < SUPERSTAR_MIN) {
                    System.out.println("***You're a planetary hero!***");
                }
                else {
                    System.out.println("***You're a planetary superstar!***");
                }
                System.out.println("\nGoodbye!");
            }
            else {
                System.out.println("Invalid choice. Please try again.\n");
            }
        } while (mainLoop);
        
        scnr.close();
    }
}