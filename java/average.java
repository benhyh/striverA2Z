/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.io.*;
import java.util.Scanner;

public class Averages {

	public static void main(String[] args) throws IOException { 
		// vars
        double sum = 0.0;
        double num;
        int count;

        // name input scanner
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of an input file: ");
        String name = input.nextLine();
        File inputFile = new File(name);
        input.close();

        // file input scanner
        input = new Scanner(inputFile);
        while(input.hasNextDouble()) {
            num = input.nextDouble();
            sum += num;
            count++;
        }

        // output file
        File average = new File("average.txt");
        PrintWriter output = new PrintWriter(average);
        output.printf("%.1f",  (sum / count));

        input.close();
        output.close();
	}	
}

/**
 * @author Ben Huynh
 * CIS 36A
 */

import java.io.*;
import java.util.Scanner;

public class Poetry {

	public static void main(String[] args) throws IOException { 
		Scanner input = new Scanner(System.in);
		String word, line;
      String title = "";
		int count = 0;
      File statistics = new File("statistics.txt");
      PrintWriter output = new PrintWriter(statistics);

		System.out.print("Enter the name of an input file: ");
		String name = input.nextLine();
        File inputFile = new File(name);
        input.close();

        input = new Scanner(inputFile);

        while (input.hasNext() && count < 1) {
            title = input.nextLine();
            count++;
        }
        
        while (input.hasNext()) {
            input.next();
            count++;
        }
        
        count -= 1;

        output.println("Statistics for " + title + ":");
        output.println("Word count: " + count);

        System.out.println("Statistics for " + title + ":");
        System.out.println("Word count: " + count);
        
        input = new Scanner(inputFile);
        count = 0;
        while (input.hasNextLine()) {
            input.nextLine();
            count++;
        }
        
        count -= 2;
        
        output.println("Line count: " + count);
        System.out.println("Line count: " + count);
      
        input.close();
        output.close();
	}
	
}