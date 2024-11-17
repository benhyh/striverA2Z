/**
* @author Ben Huynh
* CIS 36A
*/

import java.util.Scanner;

public class ReadingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int books;
        int bookCount = 0;
        int bookTitlesAM = 0;
        int bookTitlesNZ = 0;
        String author;
        String authorString;

        System.out.println("Enter the total number of books on your reading list: " + "\n");
        books = input.nextInt();
        input.nextLine();

        String[] bookArray = new String[books];
        int arrayLength = bookArray.length;

        System.out.println("Next, enter the " + books + " book titles and authors:");

        for (int i = 0; i < books; i++) {
            System.out.println("Enter book #" + (i + 1) + ": ");
            bookArray[i] = input.nextLine();

            char firstChar = bookArray[i].toUpperCase().charAt(0);
            if (firstChar >= 'A' && firstChar <= 'M') {
                bookTitlesAM++;
            } else if (firstChar >= 'N' && firstChar <= 'Z') {
                bookTitlesNZ++;
            }
        }

        System.out.println("\nEnter the last name of an author on your list: ");
        author = input.nextLine();
        
        for (int i = 0; i < bookArray.length; i++) {
            String entry = bookArray[i];

            int lastSpace = entry.length() - 1;
            while (lastSpace >= 0 && entry.charAt(lastSpace) != ' ') lastSpace--;

            if (lastSpace >= 0) {
                String bookAuthor = entry.substring(lastSpace + 1, entry.length());

                if (bookAuthor.equals(author)) {
                    bookCount++;
                }
            }
        }
        
        System.out.println("There are " + bookCount + " books by " + author + " on your reading list.");
        System.out.println("Books with titles A-M: " + bookTitlesAM);
        System.out.println("Books with titles N-Z: " + bookTitlesNZ);

        input.close();
    }
}