  System.out.println("Which BIG IMPACT action(s) will you pledge to take?\n");

            choice.scnr.nextLine().toUpperCase();

            System.out.println("1. Pledge to stop flying (100 pts)");
            System.out.println("2. Join a climate action group (100 pts)");
            System.out.println("3. Adopt a 100% plant-based diet (100 pts)");
            System.out.println("4. Replace your furnace with a heat pump (80 pts)");
            System.out.println("R. Return to main menu");

            if (choice.equals("R")) {
                System.out.println("\nReturning to main menu...\n");
                big = false;
            } else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
                if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                    points += 100;
                    lastChoice = choice;
                } else if (choice.equals("4")) {
                    points += 80;
                }
            } else {
                System.out.println("Invalid choice. Please try again.\n");
            } 

            if (choice.equals(lastChoice)) {
                System.out.println("You already made that pledge!\n Please select a new option or return to the main menu.\n");
            }